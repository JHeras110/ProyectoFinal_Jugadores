package com.example.services;

import java.util.List;

import com.example.model.Jugador;

/**
 * Interfaz que hace de intermediario entre el Controller y el Servicio
 */
public interface JugadoresService {
    List<Jugador> getJugadores();
    List<Jugador> getJugadoresPorEquipo(String nombreEquipo);
    String postFicharJugador(Jugador jugador);
    void deleteVenderJugador(String nombreJugador);
    void putJugador(Jugador jugador);
}
