package com.unistay.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class BookingView extends JFrame {

    public BookingView() {
        setTitle("UniStay - Bozza prenotazione");
        setSize(480, 300);
        setMinimumSize(new Dimension(480, 300));
        setLocationRelativeTo(null);
        creaComponenti();
    }

    // ── GUI ──────────────────────────────────────────────────────────────────

    private void creaComponenti() {
        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(Color.WHITE);
        root.setBorder(new EmptyBorder(24, 24, 24, 24));

        JLabel label = new JLabel("Bozza interfaccia prenotazione", SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.BOLD, 20));

        JLabel descrizione = new JLabel("La gestione completa verrà sviluppata nella fase finale.", SwingConstants.CENTER);
        descrizione.setFont(new Font("SansSerif", Font.PLAIN, 15));

        root.add(label, BorderLayout.CENTER);
        root.add(descrizione, BorderLayout.SOUTH);

        setContentPane(root);
    }

    public void mostra() {
        setVisible(true);
    }
}
