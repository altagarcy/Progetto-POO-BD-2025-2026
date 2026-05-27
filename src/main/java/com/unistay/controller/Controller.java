package com.unistay.controller;

import com.unistay.model.Guest;
import com.unistay.model.Host;
import com.unistay.model.Listing;
import com.unistay.model.User;
import com.unistay.gui.LoginView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    // ── model in memoria ─────────────────────────────────────────────────────

    private final List<User> utenti;
    private final List<Listing> annunci;
    private User utenteCorrente;

    // ── avvio applicazione ───────────────────────────────────────────────────

    public Controller() {
        utenti = new ArrayList<>();
        annunci = new ArrayList<>();
        caricaDatiDiEsempio();
    }

    public void avviaApplicazione() {
        LoginView loginView = new LoginView(this);
        loginView.mostra();
    }

    // ── interazione GUI → Controller → Model ─────────────────────────────────

    public boolean login(String email, String password) {
        for (User utente : utenti) {
            if (utente.getEmail().equals(email) && utente.getPassword().equals(password)) {
                utenteCorrente = utente;
                return true;
            }
        }
        return false;
    }

    public User getUtenteCorrente() {
        return utenteCorrente;
    }

    public List<Listing> getAnnunciDisponibili() {
        return annunci;
    }

    public String descrizioneInterazione() {
        if (utenteCorrente == null) {
            return "Nessun utente autenticato.";
        }

        return "Login simulato correttamente.\n"
                + "La GUI ha inviato i dati al Controller.\n"
                + "Il Controller ha verificato l'utente nel package model.\n\n"
                + "Utente corrente: " + utenteCorrente.getNomeCompleto() + "\n"
                + "Annunci caricati in memoria: " + annunci.size();
    }

    // ── dati temporanei per il secondo homework ──────────────────────────────

    private void caricaDatiDiEsempio() {
        Host matteo = new Host(1, "Matteo", "Reggio", "matteo@example.com", "1234", "", "Host dimostrativo");
        Guest angelo = new Guest(2, "Angelo", "Perrotti", "angelo@example.com", "1234", "");

        Listing listing1 = new Listing(1, "Camera vicino all'università", "Camera singola per studenti", "Via Roma 12", "Napoli", 350.0, 1, 1, matteo);
        Listing listing2 = new Listing(2, "Bilocale zona centro", "Piccolo appartamento per fuori sede", "Via Toledo 45", "Napoli", 520.0, 2, 2, domenico);

        utenti.add(matteo);
        utenti.add(angelo);

        annunci.add(listing1);
        annunci.add(listing2);

        matteo.aggiungiAnnuncio(listing1);
    }
}
