package com.unistay.gui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public final class LogoHelper {

    private static final String LOGO_PATH = "/logo.png";
    private static ImageIcon logoOriginale;

    private LogoHelper() {}

    public static ImageIcon getLogoScalato(int maxW, int maxH) {
        ImageIcon originale = caricaOriginale();
        if (originale == null) return null;

        int w0 = originale.getIconWidth();
        int h0 = originale.getIconHeight();
        double scala = Math.min((double) maxW / w0, (double) maxH / h0);
        int w1 = (int) (w0 * scala);
        int h1 = (int) (h0 * scala);

        Image scalata = originale.getImage().getScaledInstance(w1, h1, Image.SCALE_SMOOTH);
        return new ImageIcon(scalata);
    }

    public static Image getWindowIcon() {
        ImageIcon ic = getLogoScalato(32, 32);
        return (ic != null) ? ic.getImage() : null;
    }

    private static ImageIcon caricaOriginale() {
        if (logoOriginale == null) {
            URL url = LogoHelper.class.getResource(LOGO_PATH);
            if (url != null) {
                logoOriginale = new ImageIcon(url);
            } else {
                System.err.println("[LogoHelper] Logo non trovato: " + LOGO_PATH);
            }
        }
        return logoOriginale;
    }
}
