package com.example.dto;

/**
 * Modelo Auxiliar de la Tabla Equipos
 * 
 * @param idequipo;
 * @param nombre
 * @param ciudad
 * @param goles
 * @param puntos
 * @param victorias
 * @param empates
 * @param derrotas
 */
public class EquipoDTO {
    private int idequipo;
    private String nombre;
    private String ciudad;
    private int goles;
    private int puntos;
    private int victorias;
    private int empates;
    private int derrotas;
    public EquipoDTO() {
    }
    public EquipoDTO(String nombre, String ciudad,  int goles, int puntos, int victorias, int empates,
            int derrotas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.goles = goles;
        this.puntos = puntos;
        this.victorias = victorias;
        this.empates = empates;
        this.derrotas = derrotas;
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
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public int getGoles() {
        return goles;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public int getVictorias() {
        return victorias;
    }
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
