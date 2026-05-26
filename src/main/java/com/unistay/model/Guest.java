package com.unistay.model;

import java.util.ArrayList;
import java.util.List;

public class Guest extends User {

    private List<Booking> prenotazioni;

    public Guest(int id, String nome, String cognome, String email, String password, String telefono) {
        super(id, nome, cognome, email, password, telefono);
        this.prenotazioni = new ArrayList<>();
    }

    public Guest(String nome, String cognome, String email, String password) {
        super(nome, cognome, email, password);
        this.prenotazioni = new ArrayList<>();
    }

    public void aggiungiPrenotazione(Booking booking) {
        prenotazioni.add(booking);
    }

    public List<Booking> getPrenotazioni() { return prenotazioni; }
    public void setPrenotazioni(List<Booking> prenotazioni) { this.prenotazioni = prenotazioni; }

    @Override
    public String toString() {
        return "Guest{email='" + getEmail() + "', prenotazioni=" + prenotazioni.size() + "}";
    }
}
