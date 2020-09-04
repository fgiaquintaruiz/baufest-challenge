package com.baufest.ingreso.arrays;

public class Ticket {

    private int ronda;
    private int charla;
    private String titulo;
    private String espectador;

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public int getCharla() {
        return charla;
    }

    public void setCharla(int charla) {
        this.charla = charla;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEspectador() {
        return espectador;
    }

    public void setEspectador(String espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ronda=" + ronda +
                ", charla=" + charla +
                ", titulo='" + titulo + '\'' +
                ", espectador='" + espectador + '\'' +
                '}';
    }
}
