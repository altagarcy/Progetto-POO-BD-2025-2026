package com.unistay.model;

import java.time.LocalDateTime;

public class Payment {

    public enum MetodoPagamento {
        CARTA_CREDITO,
        CARTA_DEBITO,
        PAYPAL,
        BONIFICO
    }

    public enum StatoPagamento {
        IN_ATTESA,
        COMPLETATO,
        FALLITO,
        RIMBORSATO
    }

    private int id;
    private Booking booking;
    private double importo;
    private MetodoPagamento metodo;
    private StatoPagamento stato;
    private LocalDateTime dataOra;

    public Payment(int id, Booking booking, double importo, MetodoPagamento metodo) {
        this.id = id;
        this.booking = booking;
        this.importo = importo;
        this.metodo = metodo;
        this.stato = StatoPagamento.IN_ATTESA;
        this.dataOra = LocalDateTime.now();
    }

    public Payment(Booking booking, MetodoPagamento metodo) {
        this.booking = booking;
        this.importo = booking.getPrezzoTotale();
        this.metodo = metodo;
        this.stato = StatoPagamento.IN_ATTESA;
        this.dataOra = LocalDateTime.now();
    }

    public boolean elabora() {
        this.stato = StatoPagamento.COMPLETATO;
        return true;
    }

    public void rimborsa() {
        this.stato = StatoPagamento.RIMBORSATO;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Booking getBooking() { return booking; }
    public void setBooking(Booking booking) { this.booking = booking; }

    public double getImporto() { return importo; }
    public void setImporto(double importo) { this.importo = importo; }

    public MetodoPagamento getMetodo() { return metodo; }
    public void setMetodo(MetodoPagamento metodo) { this.metodo = metodo; }

    public StatoPagamento getStato() { return stato; }
    public void setStato(StatoPagamento stato) { this.stato = stato; }

    public LocalDateTime getDataOra() { return dataOra; }
    public void setDataOra(LocalDateTime dataOra) { this.dataOra = dataOra; }

    @Override
    public String toString() {
        return "Payment{id=" + id + ", importo=" + importo + "€, metodo=" + metodo + ", stato=" + stato + "}";
    }
}
