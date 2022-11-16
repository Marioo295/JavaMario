package Graficos;

import javax.swing.*;

import java.awt.event.*;

public class PruebaEventosFocoVentana extends JFrame implements WindowFocusListener {
    public static void main(String[] args) {
        PruebaEventosFocoVentana miv=new PruebaEventosFocoVentana();
        miv.iniciar();
    }

    PruebaEventosFocoVentana marco1;
    PruebaEventosFocoVentana marco2;

    public void iniciar() {
        marco1=new PruebaEventosFocoVentana();
        marco2=new PruebaEventosFocoVentana();
        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(100, 100, 600, 350);
        marco2.setBounds(700, 100, 600, 350);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }

    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource()==marco1) {
            marco1.setTitle("¡¡Tengo el foco!!");
        } else {
            marco2.setTitle("¡¡Tengo el foco!!");
        }
    }

    public void windowLostFocus(WindowEvent e) {
        if (e.getSource()==marco1) {
            marco1.setTitle("");
        } else {
            marco2.setTitle("");
        }
    }
}

