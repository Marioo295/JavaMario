package Graficos;

import java.awt.*;

import javax.swing.*;

public class Layouts {
    public static void main(String[] args) {
        MarcoLayout miMarco=new MarcoLayout();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoLayout extends JFrame {
    public MarcoLayout() {
        setTitle("Layouts");
        setBounds(700, 300, 500, 300);
        PanelLayout miLamina=new PanelLayout();
        /* FlowLayout disposicion=new FlowLayout(FlowLayout.CENTER, 75, 100);
        miLamina.setLayout(disposicion); */
        add(miLamina, BorderLayout.NORTH);
        PanelLayout2 miLamina2=new PanelLayout2();
        add(miLamina2, BorderLayout.SOUTH);
    }
}

class PanelLayout extends JPanel {
    JButton botonAzul=new JButton("Azul");
    JButton botonAmarillo=new JButton("Amarillo");
    
    public PanelLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(botonAzul);
        add(botonAmarillo);
    }
}

class PanelLayout2 extends JPanel {
    JButton botonRojo=new JButton("Rojo");
    JButton botonVerde=new JButton("Verde");
    JButton botonNegro=new JButton("Negro");

    public PanelLayout2() {
        setLayout(new BorderLayout());
        add(botonRojo, BorderLayout.WEST);
        add(botonVerde, BorderLayout.EAST);
        add(botonNegro);
    }
}