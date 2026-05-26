package com.unistay.gui;

import com.unistay.controller.Controller;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;

public class LoginView extends JFrame {

    private static final Color ROSSO = new Color(255, 80, 86);
    private static final Color TESTO = new Color(32, 32, 32);
    private static final Color GRIGIO = new Color(120, 120, 120);
    private static final Color BORDO = new Color(218, 218, 218);

    private final Controller controller;

    private JTextField campoEmail;
    private JPasswordField campoPassword;
    private JButton bottoneLogin;
    private JButton bottoneBozza;
    private JLabel etichettaMessaggio;

    public LoginView(Controller controller) {
        this.controller = controller;
        inizializzaFinestra();
        creaComponenti();
        aggiungiAscoltatori();
    }

    // ── GUI ──────────────────────────────────────────────────────────────────

    private void inizializzaFinestra() {
        setTitle("UniStay - Secondo Homework");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(620, 720);
        setMinimumSize(new Dimension(620, 720));

        Image icon = LogoHelper.getWindowIcon();
        if (icon != null) {
            setIconImage(icon);
        }
    }

    private void creaComponenti() {
        JPanel root = new JPanel(new GridBagLayout());
        root.setBackground(Color.WHITE);
        root.setPreferredSize(new Dimension(620, 720));

        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(Color.WHITE);
        card.setBorder(new EmptyBorder(36, 74, 36, 74));
        card.setPreferredSize(new Dimension(620, 720));

        JLabel logo = creaLogo();

        JLabel titolo = new JLabel("UniStay");
        titolo.setFont(new Font("SansSerif", Font.BOLD, 36));
        titolo.setForeground(ROSSO);
        titolo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel sottotitolo = new JLabel("Bozza GUI - secondo homework");
        sottotitolo.setFont(new Font("SansSerif", Font.PLAIN, 16));
        sottotitolo.setForeground(GRIGIO);
        sottotitolo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel lblEmail = creaLabelCampo("Email");
        campoEmail = creaCampoTesto("angelo@example.com");

        JLabel lblPassword = creaLabelCampo("Password");
        campoPassword = creaCampoPassword();
        campoPassword.setText("1234");

        bottoneLogin = creaBottonePrincipale("Simula login");
        bottoneBozza = creaBottoneSecondario("Apri bozza schermata annunci");

        etichettaMessaggio = new JLabel(" ");
        etichettaMessaggio.setFont(new Font("SansSerif", Font.PLAIN, 15));
        etichettaMessaggio.setAlignmentX(Component.CENTER_ALIGNMENT);
        etichettaMessaggio.setHorizontalAlignment(SwingConstants.CENTER);

        card.add(Box.createVerticalStrut(8));
        card.add(logo);
        card.add(Box.createVerticalStrut(12));
        card.add(titolo);
        card.add(Box.createVerticalStrut(6));
        card.add(sottotitolo);
        card.add(Box.createVerticalStrut(42));
        card.add(lblEmail);
        card.add(Box.createVerticalStrut(8));
        card.add(campoEmail);
        card.add(Box.createVerticalStrut(22));
        card.add(lblPassword);
        card.add(Box.createVerticalStrut(8));
        card.add(campoPassword);
        card.add(Box.createVerticalStrut(32));
        card.add(bottoneLogin);
        card.add(Box.createVerticalStrut(14));
        card.add(bottoneBozza);
        card.add(Box.createVerticalStrut(18));
        card.add(etichettaMessaggio);

        root.add(card);
        setContentPane(root);
    }

    private JLabel creaLogo() {
        ImageIcon logoIcon = LogoHelper.getLogoScalato(190, 150);
        JLabel label;

        if (logoIcon != null) {
            label = new JLabel(logoIcon);
        } else {
            label = new JLabel("UniStay");
            label.setFont(new Font("SansSerif", Font.BOLD, 42));
            label.setForeground(ROSSO);
        }

        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
    }

    private JLabel creaLabelCampo(String testo) {
        JLabel label = new JLabel(testo);
        label.setFont(new Font("SansSerif", Font.BOLD, 17));
        label.setForeground(TESTO);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        return label;
    }

    private JTextField creaCampoTesto(String testo) {
        JTextField campo = new JTextField(testo);
        configuraCampo(campo);
        return campo;
    }

    private JPasswordField creaCampoPassword() {
        JPasswordField campo = new JPasswordField();
        configuraCampo(campo);
        return campo;
    }

    private void configuraCampo(JTextField campo) {
        campo.setFont(new Font("SansSerif", Font.PLAIN, 18));
        campo.setPreferredSize(new Dimension(470, 52));
        campo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 52));
        campo.setAlignmentX(Component.LEFT_ALIGNMENT);
        campo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDO, 1),
                BorderFactory.createEmptyBorder(10, 14, 10, 14)
        ));
    }

    private JButton creaBottonePrincipale(String testo) {
        JButton bottone = new JButton(testo);
        bottone.setFont(new Font("SansSerif", Font.BOLD, 18));
        bottone.setBackground(ROSSO);
        bottone.setForeground(Color.WHITE);
        bottone.setFocusPainted(false);
        bottone.setBorderPainted(false);
        bottone.setOpaque(true);
        bottone.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bottone.setPreferredSize(new Dimension(470, 56));
        bottone.setMaximumSize(new Dimension(Integer.MAX_VALUE, 56));
        bottone.setAlignmentX(Component.LEFT_ALIGNMENT);
        return bottone;
    }

    private JButton creaBottoneSecondario(String testo) {
        JButton bottone = new JButton(testo);
        bottone.setFont(new Font("SansSerif", Font.PLAIN, 15));
        bottone.setBackground(Color.WHITE);
        bottone.setForeground(ROSSO);
        bottone.setFocusPainted(false);
        bottone.setBorderPainted(false);
        bottone.setOpaque(true);
        bottone.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bottone.setAlignmentX(Component.CENTER_ALIGNMENT);
        return bottone;
    }

    // ── Controller ───────────────────────────────────────────────────────────

    private void aggiungiAscoltatori() {
        bottoneLogin.addActionListener(e -> tentaLogin());
        campoEmail.addActionListener(e -> tentaLogin());
        campoPassword.addActionListener(e -> tentaLogin());
        bottoneBozza.addActionListener(e -> new ListingView(controller).mostra());
    }

    private void tentaLogin() {
        String email = campoEmail.getText().trim();
        String password = new String(campoPassword.getPassword());

        if (email.isEmpty() || password.isEmpty()) {
            mostraErrore("Inserisci email e password.");
            return;
        }

        if (controller.login(email, password)) {
            mostraSuccesso("Dati inviati correttamente al Controller.");
            JOptionPane.showMessageDialog(this,
                    controller.descrizioneInterazione(),
                    "Interazione GUI - Controller - Model",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            mostraErrore("Credenziali non presenti nei dati temporanei.");
        }
    }

    public void mostraErrore(String messaggio) {
        etichettaMessaggio.setForeground(Color.RED);
        etichettaMessaggio.setText(messaggio);
    }

    public void mostraSuccesso(String messaggio) {
        etichettaMessaggio.setForeground(new Color(0, 150, 0));
        etichettaMessaggio.setText(messaggio);
    }

    public void mostra() {
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
