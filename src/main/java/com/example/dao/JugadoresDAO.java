package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Jugador;

/**
 * Interfaz que nos ayuda a mapear el objeto con el que vamos a trabajar a
 * la hora de intercambiar informacion con la BBDD
 */
public interface JugadoresDAO extends JpaRepository<Jugador, Integer>{
 
    @Query("SELECT j FROM Jugador j WHERE j.idequipo = :codigo")
    List<Jugador> getJugadoresPorEquipo(@Param("codigo") int codigo);

}
