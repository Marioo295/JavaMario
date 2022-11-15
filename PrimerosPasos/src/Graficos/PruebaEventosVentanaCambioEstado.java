package Graficos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class PruebaEventosVentanaCambioEstado {
    public static void main(String[] args) {
        MarcoEstado miMarco=new MarcoEstado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoEstado extends JFrame {
    public MarcoEstado() {
        setTitle("Cambio de estado");
        setBounds(700, 300, 500, 300);
        setVisible(true);
        CambiaEstado nuevoEstado=new CambiaEstado();
        addWindowStateListener(nuevoEstado);
    }
}

class CambiaEstado implements WindowStateListener {
    public void windowStateChanged(WindowEvent e) {
        //System.out.println("La ventana ha cambiado de estado");
        if (e.getNewState()==Frame.MAXIMIZED_BOTH) {
            System.out.println("La ventana está a pantalla completa");
        } else if (e.getNewState()==Frame.NORMAL) {
            System.out.println("La ventana está normal");
        } else if (e.getNewState()==Frame.ICONIFIED) {
            System.out.println("La ventana está minimizada");
        }
    }
}