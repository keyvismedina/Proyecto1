/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sopadeletraskeyvis;

import com.mycompany.sopadeletraskeyvis.gui.MainFrame;

import javax.swing.SwingUtilities;

/**
 * Clase principal de la aplicación Sopa de Letras Keyvis.
 * Este es el punto de entrada de la aplicación, donde se inicializa la interfaz gráfica.
 */
public class SopaDeLetrasKeyvis {

    public static void main(String[] args) {
        // Asegura que la creación y actualización de componentes de Swing se realice
        // en el Event Dispatch Thread (EDT), que es el hilo seguro para Swing.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crea una instancia de tu ventana principal
                MainFrame frame = new MainFrame();
                // Hace visible la ventana
                frame.setVisible(true);
            }
        });
    }
}