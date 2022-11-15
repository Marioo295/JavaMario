package Graficos;

import javax.swing.*;

import java.awt.event.*;

public class PruebaEventosVentana {
    public static void main(String[] args) {
        MarcoVentana miMarco=new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        miMarco.setTitle("Ventana 1");
        miMarco.setBounds(300, 300, 500, 350);
        MarcoVentana miMarco2=new MarcoVentana();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco2.setTitle("Ventana 2");
        miMarco2.setBounds(900, 300, 500, 350);
    }
}

class MarcoVentana extends JFrame {
    public MarcoVentana() {
        //setTitle("Respondiendo");
        //setBounds(300, 300, 500, 350);
        setVisible(true);
        MVentana oyenteVentana=new MVentana();
        addWindowListener(oyenteVentana);
        //addWindowListener(new MVentana())
    }
}

class MVentana extends WindowAdapter {
    public void windowIconified(WindowEvent e){
        System.out.println("Ventana minimizada");
    }
    /* public void windowActivated(WindowEvent e){
        System.out.println("Ventana activada");
    }
    public void windowClosed(WindowEvent e){
        System.out.println("La ventana ha sido cerrada");
    }
    public void windowClosing(WindowEvent e){
        System.out.println("Cerrando ventana");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana desactivada");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Ventana restaurada");
    }
    public void windowOpened(WindowEvent e){
        System.out.println("Abriendo ventana");
    } */
}