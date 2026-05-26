package com.unistay.gui;

import com.unistay.controller.Controller;
import com.unistay.model.Listing;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class ListingView extends JFrame {

    private final Controller controller;

    public ListingView(Controller controller) {
        this.controller = controller;
        inizializzaFinestra();
        creaComponenti();
    }

    // ── GUI ──────────────────────────────────────────────────────────────────

    private void inizializzaFinestra() {
        setTitle("UniStay - Bozza annunci");
        setSize(560, 420);
        setMinimumSize(new Dimension(560, 420));
        setLocationRelativeTo(null);
    }

    private void creaComponenti() {
        JPanel root = new JPanel(new BorderLayout(16, 16));
        root.setBorder(new EmptyBorder(24, 24, 24, 24));
        root.setBackground(Color.WHITE);

        JLabel titolo = new JLabel("Bozza schermata annunci", SwingConstants.CENTER);
        titolo.setFont(new Font("SansSerif", Font.BOLD, 22));

        DefaultListModel<String> modelloLista = new DefaultListModel<>();
        for (Listing listing : controller.getAnnunciDisponibili()) {
            modelloLista.addElement(listing.getTitolo() + " - " + listing.getCitta());
        }

        JList<String> listaAnnunci = new JList<>(modelloLista);
        listaAnnunci.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JButton bottone = new JButton("Simula richiesta al Controller");
        bottone.setFont(new Font("SansSerif", Font.PLAIN, 15));
        bottone.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "La GUI ha richiesto al Controller gli annunci salvati temporaneamente nel model.",
                "Bozza interazione",
                JOptionPane.INFORMATION_MESSAGE));

        root.add(titolo, BorderLayout.NORTH);
        root.add(new JScrollPane(listaAnnunci), BorderLayout.CENTER);
        root.add(bottone, BorderLayout.SOUTH);

        setContentPane(root);
    }

    // ── Controller ───────────────────────────────────────────────────────────

    public void mostra() {
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
