package Graficos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class PruebaEventos {
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

class LaminaBotones extends JPanel implements ActionListener {
    JButton botonAzul=new JButton("Azul");
    JButton botonAmarillo=new JButton("Amarillo");
    JButton botonRojo=new JButton("Rojo");

    public LaminaBotones() {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        botonAzul.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado=e.getSource();
        if (botonPulsado==botonAzul) {
            setBackground(Color.BLUE);    
        } else if (botonPulsado==botonAmarillo) {
            setBackground(Color.YELLOW);
        } else {
            setBackground(Color.RED);
        } 
    }
}