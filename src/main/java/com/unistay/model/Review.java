package com.unistay.model;

import java.time.LocalDate;

public class Review {

    private int id;
    private Guest guest;
    private Listing listing;
    private int voto;
    private String commento;
    private LocalDate data;

    public Review(int id, Guest guest, Listing listing, int voto, String commento) {
        this.id = id;
        this.guest = guest;
        this.listing = listing;
        setVoto(voto);
        this.commento = commento;
        this.data = LocalDate.now();
    }

    public Review(Guest guest, Listing listing, int voto, String commento) {
        this.guest = guest;
        this.listing = listing;
        setVoto(voto);
        this.commento = commento;
        this.data = LocalDate.now();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Guest getGuest() { return guest; }
    public void setGuest(Guest guest) { this.guest = guest; }

    public Listing getListing() { return listing; }
    public void setListing(Listing listing) { this.listing = listing; }

    public int getVoto() { return voto; }

    public void setVoto(int voto) {
        if (voto < 1 || voto > 5) {
            throw new IllegalArgumentException("il voto deve essere tra 1 e 5.");
        }
        this.voto = voto;
    }

    public String getCommento() { return commento; }
    public void setCommento(String commento) { this.commento = commento; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getStelle() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb.append(i <= voto ? "★" : "☆");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Review{guest=" + guest.getNomeCompleto() + ", listing='" + listing.getTitolo() +
               "', voto=" + getStelle() + ", data=" + data + "}";
    }
}
