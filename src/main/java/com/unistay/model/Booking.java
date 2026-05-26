package com.unistay.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Booking {

    public enum StatoPrenotazione {
        IN_ATTESA,
        CONFERMATA,
        ANNULLATA,
        COMPLETATA
    }

    private int id;
    private Guest guest;
    private Listing listing;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private double prezzoTotale;
    private StatoPrenotazione stato;
    private Payment pagamento;

    public Booking(int id, Guest guest, Listing listing, LocalDate dataInizio, LocalDate dataFine) {
        this.id = id;
        this.guest = guest;
        this.listing = listing;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.stato = StatoPrenotazione.IN_ATTESA;
        this.prezzoTotale = calcolaPrezzoTotale();
    }

    public Booking(Guest guest, Listing listing, LocalDate dataInizio, LocalDate dataFine) {
        this.guest = guest;
        this.listing = listing;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.stato = StatoPrenotazione.IN_ATTESA;
        this.prezzoTotale = calcolaPrezzoTotale();
    }

    public long getNumeraNotti() {
        return ChronoUnit.DAYS.between(dataInizio, dataFine);
    }

    public double calcolaPrezzoTotale() {
        return getNumeraNotti() * listing.getPrezzoPernottamento();
    }

    public void conferma() { this.stato = StatoPrenotazione.CONFERMATA; }
    public void annulla()  { this.stato = StatoPrenotazione.ANNULLATA; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Guest getGuest() { return guest; }
    public void setGuest(Guest guest) { this.guest = guest; }

    public Listing getListing() { return listing; }
    public void setListing(Listing listing) { this.listing = listing; }

    public LocalDate getDataInizio() { return dataInizio; }
    public void setDataInizio(LocalDate dataInizio) { this.dataInizio = dataInizio; }

    public LocalDate getDataFine() { return dataFine; }
    public void setDataFine(LocalDate dataFine) { this.dataFine = dataFine; }

    public double getPrezzoTotale() { return prezzoTotale; }
    public void setPrezzoTotale(double prezzoTotale) { this.prezzoTotale = prezzoTotale; }

    public StatoPrenotazione getStato() { return stato; }
    public void setStato(StatoPrenotazione stato) { this.stato = stato; }

    public Payment getPagamento() { return pagamento; }
    public void setPagamento(Payment pagamento) { this.pagamento = pagamento; }

    @Override
    public String toString() {
        return "Booking{id=" + id + ", guest=" + guest.getNomeCompleto() +
               ", listing='" + listing.getTitolo() + "', stato=" + stato +
               ", totale=" + prezzoTotale + "€}";
    }
}
