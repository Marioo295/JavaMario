package Graficos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class PruebaEventos2 {
    public static void main(String[] args) {
        MarcoBotones miMarco=new MarcoBotones();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoBotones extends JFrame {
    public MarcoBotones() {
        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotones miLamina=new LaminaBotones();
        add(miLamina);
    }
}

class LaminaBotones extends JPanel {
    JButton botonAzul=new JButton("Azul");
    JButton botonAmarillo=new JButton("Amarillo");
    JButton botonRojo=new JButton("Rojo");

    public LaminaBotones() {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        ColorFondo Azul=new ColorFondo(Color.BLUE);
        ColorFondo Amarillo=new ColorFondo(Color.YELLOW);
        ColorFondo Rojo=new ColorFondo(Color.RED);
        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Amarillo);
        botonRojo.addActionListener(Rojo);
    }

    private class ColorFondo implements ActionListener {
        private Color colorDeFondo;
    
        public ColorFondo(Color c) {
            colorDeFondo=c;
        }
    
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }
    }
}