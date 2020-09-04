package com.baufest.ingreso.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CicloDeCharlas {

    private String titulo;
    private Charla[][] charlas;
    private Date fechaInicio;
    private int cantidadMaximaPorCharla = 50;

    public CicloDeCharlas(String titulo, Date fechaInicio, List<String> peliculas){
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;

        List<Charla> listaCharlas = new ArrayList<Charla>();
        int maxRonda = 2;
        int peliculasCant = peliculas.size();
        this.charlas = new Charla[maxRonda][peliculasCant*2];

        int nroCharla = 1;
        for(int nroRonda = 0; nroRonda < maxRonda; nroRonda++){

            for(String pelicula : peliculas){
                Fecha fecha = new Fecha(fechaInicio.getDate(), fechaInicio.getMonth(), fechaInicio.getYear());

                Date fechaCalculada;
                if(nroRonda == 0){
                    fechaCalculada = new Date(fecha.getAnio(), fecha.getMes(), fecha.getDia()+nroCharla);
                } else {
                    fechaCalculada = new Date(fecha.getAnio(), fecha.getMes(), fecha.getDia()+nroCharla+4);
                }

                Charla charla = new Charla(pelicula, fechaCalculada, nroRonda, nroCharla);
                this.charlas[nroRonda][nroCharla-1] = charla;
                nroCharla++;
            }
        }

    }

    public Ticket registrarEspectador(int nroCharla, String espectador){

        int nroRonda = 0;
        if(nroCharla > 5){
            nroRonda = 1;
        }

        return this.charlas[nroRonda][nroCharla].registrarEspectador(espectador);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getCantidadMaximaPorCharla() {
        return cantidadMaximaPorCharla;
    }

    public void setCantidadMaximaPorCharla(int cantidadMaximaPorCharla) {
        this.cantidadMaximaPorCharla = cantidadMaximaPorCharla;
    }

    @Override
    public String toString() {
        return "CicloDeCharlas{" +
                "titulo='" + titulo + '\'' +
                ", charlas=" + Arrays.deepToString(charlas) +
                ", fechaInicio=" + fechaInicio +
                ", cantidadMaximaPorCharla=" + cantidadMaximaPorCharla +
                '}';
    }
}
