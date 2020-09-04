package com.baufest.ingreso.arrays;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Charla {

    private String titulo;
    private Date fecha;
    private List<Ticket> tickets = new ArrayList<Ticket>();
    private int ronda;
    private int charla;

    public Charla(String titulo, Date fecha, int ronda, int charla){
        this.titulo = titulo;
        this.fecha = fecha;
        this.ronda = ronda;
        this.charla = charla;

    }

    public Ticket registrarEspectador(String espectador){

        boolean yaExiste = false;
        for(Ticket ticket : this.tickets){
            if(espectador.equals(ticket.getEspectador())){
                yaExiste = true;
                break;
            }
        }

        if(!yaExiste){
            Ticket ticket = new Ticket();
            ticket.setCharla(this.charla);
            ticket.setRonda(this.ronda);
            ticket.setTitulo(this.titulo);
            ticket.setEspectador(espectador);
            this.tickets.add(ticket);
            return ticket;
        } else {
            return null;
        }


    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

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

    @Override
    public String toString() {
        return "Charla{" +
                "titulo='" + titulo + '\'' +
                ", fecha=" + fecha +
                ", tickets=" + tickets.toString() +
                ", ronda=" + ronda +
                ", charla=" + charla +
                '}';
    }
}
