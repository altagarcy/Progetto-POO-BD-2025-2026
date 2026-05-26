package com.unistay;

import com.unistay.controller.Controller;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Controller controller = new Controller();
            controller.avviaApplicazione();
        });
    }
}
