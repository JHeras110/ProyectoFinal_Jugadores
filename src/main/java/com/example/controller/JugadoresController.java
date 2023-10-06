package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Jugador;
import com.example.services.JugadoresService;

/**
 * RestController que nos ayuda con el Mapeo de la aplicacion
 */
@RestController
public class JugadoresController {
    
    @Autowired
    JugadoresService service;

    @GetMapping(value="jugadores")
    public List<Jugador> getJugadores() {
        return service.getJugadores();
    }

    @GetMapping(value="jugador/equipo/{equipo}")
    public List<Jugador> getJugadoresPorEquipo(@PathVariable("equipo")String nombreEquipo) {
        return service.getJugadoresPorEquipo(nombreEquipo);
    }


    @PostMapping(value="jugador")
    public List<Jugador> postFicharJugador(@RequestBody Jugador jugador) {
        return service.getJugadoresPorEquipo(service.postFicharJugador(jugador));
    }

    @DeleteMapping(value="jugador/{jugador}")
    public void deleteVenderJugador(@PathVariable("jugador")String nombreJugador) {
        service.deleteVenderJugador(nombreJugador);
    }


    @PutMapping(value="jugador")
    public void putJugador(@RequestBody Jugador jugador) {
        service.putJugador(jugador);
    }


}
