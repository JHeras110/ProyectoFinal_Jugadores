package com.example.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dao.JugadoresDAO;
import com.example.dto.EquipoDTO;
import com.example.exceptions.NombreNoEncontradoException;
import com.example.model.Jugador;

/**
 * Servicio que saca los datos de la BBDD
 */
@Service
public class JugadoresServiceImpl implements JugadoresService {

    @Autowired
    JugadoresDAO dao;

    @Autowired
    RestTemplate template;
    String url = "http://localhost:8800/";

    /**
     * Metodo que devuelve un listado de jugadores
     */
    @Override
    public List<Jugador> getJugadores() {
        List<Jugador> jugadores = dao.findAll();      
        return jugadores;
    }

    
    /**
     * Metodo que Recibe el nombre de un equipo, y devuelve todos los jugadores del equipo
     */
    @Override
    public List<Jugador> getJugadoresPorEquipo(String nombreEquipo) {
        List<EquipoDTO> equipos = Arrays.asList(template.getForObject(url+"equipos", EquipoDTO[].class));
        int codigoEquipo = 0;
        for (EquipoDTO equipo : equipos) {
            if(equipo.getNombre().equalsIgnoreCase(nombreEquipo)){
                codigoEquipo = equipo.getIdequipo();
            }else{
                throw new NombreNoEncontradoException("No se ha encontrado ningun equi con el nombre "+nombreEquipo);
            }
        }        
        return dao.getJugadoresPorEquipo(codigoEquipo);
    }


    /**
     * Metodo que Recibe el nombre de un jugador, comprueba que existe y lo elimina.
     */
    @Override
    public void deleteVenderJugador(String nombreJugador) {
        List<Jugador> jugadores = dao.findAll();
        for (Jugador jugador : jugadores) {
            if(jugador.getNombre().equalsIgnoreCase(nombreJugador)){   
                dao.deleteById(jugador.getIdjugadores());
            }
        }
    }


    /**
     * Metodo que Inserta un Jugador en la BBDD
     */
    @Override
    public String postFicharJugador(Jugador jugador) {
        dao.save(jugador);
        return jugador.getNombre();
    }

    /**
     * Metodo que Actualiza un Jugador en la BBDD
     */
    @Override
    public void putJugador(Jugador jugador) {
        dao.save(jugador);
    }
    
}
