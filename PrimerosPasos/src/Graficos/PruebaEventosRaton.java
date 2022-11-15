package Graficos;

import javax.swing.*;

import java.awt.event.*;

public class PruebaEventosRaton {
    public static void main(String[] args) {
        MarcoRaton miMarco=new MarcoRaton();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoRaton extends JFrame {
    public MarcoRaton() {
        setTitle("Raton");
        setBounds(700, 300, 600, 450);
        setVisible(true);
        EventosRaton raton=new EventosRaton();
        addMouseListener(raton);
        EventosRaton2 raton2=new EventosRaton2();
        addMouseMotionListener(raton2);
    }
}

class EventosRaton extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
        if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("Has pulsado el botón izquierdo");
        } else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("Has la rueda del ratón");
        } else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("Has pulsado el botón derecho");
        }   
    }

    /* public void mouseClicked(MouseEvent e) {
        System.out.println("Coordenada X: " +e.getX() + " .Coordenada Y: " + e.getY());
        System.out.println(e.getClickCount());
        System.out.println("Has hecho click");
    } */

    /* public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar el ratón");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar el ratón");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar del marco");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir del marco");
    } */
}

class EventosRaton2 implements MouseMotionListener {    
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estás arrastrando");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Estás moviendo el ratón");       
    }  
}