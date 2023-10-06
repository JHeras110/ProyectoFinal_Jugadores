package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Modelo de la Tabla Jugadores
 * 
 * @param idjugadores;
 * @param idequipo;
 * @param nombre
 * @param nacionalidad
 * @param goles
 */
@Entity
@Table(name="jugadores")
public class Jugador {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idjugadores;
    private int idequipo;
    private String nombre;
    private String nacionalidad;
    private int goles;

    public Jugador() {
    }
    public Jugador(int idequipo, String nombre, String nacionalidad, int goles) {
        this.idequipo = idequipo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.goles = goles;
    }
    
    public int getIdequipo() {
        return idequipo;
    }
    public void setIdequipo(int idequipo) {
        this.idequipo = idequipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public int getGoles() {
        return goles;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
    public int getIdjugadores() {
        return idjugadores;
    }
    public void setIdjugadores(int idjugadores) {
        this.idjugadores = idjugadores;
    }


}