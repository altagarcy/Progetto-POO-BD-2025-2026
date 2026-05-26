package com.unistay.model;

import java.util.ArrayList;
import java.util.List;

public class Host extends User {

    private String descrizione;
    private List<Listing> annunci;

    public Host(int id, String nome, String cognome, String email, String password, String telefono, String descrizione) {
        super(id, nome, cognome, email, password, telefono);
        this.descrizione = descrizione;
        this.annunci = new ArrayList<>();
    }

    public Host(String nome, String cognome, String email, String password) {
        super(nome, cognome, email, password);
        this.annunci = new ArrayList<>();
    }

    public void aggiungiAnnuncio(Listing listing) {
        annunci.add(listing);
    }

    public void rimuoviAnnuncio(Listing listing) {
        annunci.remove(listing);
    }

    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    public List<Listing> getAnnunci() { return annunci; }
    public void setAnnunci(List<Listing> annunci) { this.annunci = annunci; }

    @Override
    public String toString() {
        return "Host{email='" + getEmail() + "', annunci=" + annunci.size() + "}";
    }
}
