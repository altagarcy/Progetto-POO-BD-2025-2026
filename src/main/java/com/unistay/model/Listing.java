package com.unistay.model;

public class Listing {

    private int id;
    private String titolo;
    private String descrizione;
    private String indirizzo;
    private String citta;
    private double prezzoPernottamento;
    private int numeroCamere;
    private int postiLetto;
    private boolean disponibile;
    private Host host;

    public Listing(int id, String titolo, String descrizione, String indirizzo,
                   String citta, double prezzoPernottamento, int numeroCamere,
                   int postiLetto, Host host) {
        this.id = id;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.prezzoPernottamento = prezzoPernottamento;
        this.numeroCamere = numeroCamere;
        this.postiLetto = postiLetto;
        this.host = host;
        this.disponibile = true;
    }

    public Listing(String titolo, String citta, double prezzoPernottamento, Host host) {
        this.titolo = titolo;
        this.citta = citta;
        this.prezzoPernottamento = prezzoPernottamento;
        this.host = host;
        this.disponibile = true;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }

    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    public String getIndirizzo() { return indirizzo; }
    public void setIndirizzo(String indirizzo) { this.indirizzo = indirizzo; }

    public String getCitta() { return citta; }
    public void setCitta(String citta) { this.citta = citta; }

    public double getPrezzoPernottamento() { return prezzoPernottamento; }
    public void setPrezzoPernottamento(double prezzo) { this.prezzoPernottamento = prezzo; }

    public int getNumeroCamere() { return numeroCamere; }
    public void setNumeroCamere(int numeroCamere) { this.numeroCamere = numeroCamere; }

    public int getPostiLetto() { return postiLetto; }
    public void setPostiLetto(int postiLetto) { this.postiLetto = postiLetto; }

    public boolean isDisponibile() { return disponibile; }
    public void setDisponibile(boolean disponibile) { this.disponibile = disponibile; }

    public Host getHost() { return host; }
    public void setHost(Host host) { this.host = host; }

    @Override
    public String toString() {
        return "Listing{id=" + id + ", titolo='" + titolo + "', citta='" + citta +
               "', prezzo=" + prezzoPernottamento + "€/notte}";
    }
}
