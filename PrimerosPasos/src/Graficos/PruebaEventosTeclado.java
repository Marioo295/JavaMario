package Graficos;

import javax.swing.*;

import java.awt.event.*;

public class PruebaEventosTeclado {
    public static void main(String[] args) {
        MarcoConTeclas miMarco=new MarcoConTeclas();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoConTeclas extends JFrame {
    public MarcoConTeclas() {
        setTitle("Teclado");
        setBounds(700, 300, 600, 450);
        setVisible(true);
        EventoDeTeclado tecla=new EventoDeTeclado();
        addKeyListener(tecla);
    }
}

class EventoDeTeclado implements KeyListener {

    public void keyPressed(KeyEvent e) {
        int codigo=e.getKeyCode();
        System.out.println(codigo);
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {
        char letra=e.getKeyChar();
        System.out.println(letra);
    }
    
}