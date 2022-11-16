package Graficos;

import javax.swing.*;

import java.awt.event.*;

public class PruebaEventosVariosOyentes {
    public static void main(String[] args) {
        MarcoPrincipal miMarco=new MarcoPrincipal();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoPrincipal extends JFrame {
    public MarcoPrincipal() {
        setTitle("Prueba de varios");
        setBounds(700, 100, 300, 200);
        LaminaPrincipal miLamina=new LaminaPrincipal();
        add(miLamina);
    }
}

class LaminaPrincipal extends JPanel {
    JButton botonCerrar;

    public LaminaPrincipal() {
        JButton botonNuevo=new JButton("Nuevo");
        add(botonNuevo);
        botonCerrar=new JButton("Cerrar todo");
        add(botonCerrar);
        OyenteNuevo miOyente=new OyenteNuevo();
        botonNuevo.addActionListener(miOyente); 
    }

    private class OyenteNuevo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente marco=new MarcoEmergente(botonCerrar);
            marco.setVisible(true);
        }
    }
}

class MarcoEmergente extends JFrame {
    private static int contador=0;
    public MarcoEmergente(JButton botonDePrincipal) {
        contador++;
        setTitle("Ventana " + contador);
        setBounds(40*contador, 40*contador, 300, 150);
        CierraTodos oyenteCerrar=new CierraTodos();
        botonDePrincipal.addActionListener(oyenteCerrar);
    }

    private class CierraTodos implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
        
    }
}