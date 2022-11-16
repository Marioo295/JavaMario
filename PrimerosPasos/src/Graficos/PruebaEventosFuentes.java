package Graficos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class PruebaEventosFuentes {
    public static void main(String[] args) {
        MarcoBotones miMarco=new MarcoBotones();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoBotones extends JFrame {
    public MarcoBotones() {
        setTitle("Prueba de acciones");
        setBounds(600, 350, 600, 300);
        PanelAccion miLamina=new PanelAccion();
        add(miLamina);
    }
}

class PanelAccion extends JPanel {
    public PanelAccion() {
        AccionColor accionAmarillo=new AccionColor("Amarillo", Color.YELLOW);
        AccionColor accionAzul=new AccionColor("Azul", Color.BLUE);
        AccionColor accionRojo=new AccionColor("Rojo", Color.RED);
        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
        /* JButton botonAmarillo=new JButton("Amarillo");
        JButton botonAzul=new JButton("Azul");
        JButton botonRojo=new JButton("Rojo");
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo); */
        InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
        mapaEntrada.put(teclaAmarillo, "fondoAmarillo");
        ActionMap mapaAccion=getActionMap();
        mapaAccion.put("fondoAmarillo", accionAmarillo);
        KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl B");
        mapaEntrada.put(teclaAzul, "fondoAzul");
        ActionMap mapaAccion1=getActionMap();
        mapaAccion1.put("fondoAzul", accionAzul);
        KeyStroke teclaRojo=KeyStroke.getKeyStroke("ctrl R");
        mapaEntrada.put(teclaRojo, "fondoRojo");
        ActionMap mapaAccion3=getActionMap();
        mapaAccion3.put("fondoRojo", accionRojo);
    }

    private class AccionColor extends AbstractAction {
        public AccionColor(String nombre, Color colorBoton) {
            putValue(Action.NAME, nombre);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
            putValue("ColorDeFondo", colorBoton);
        }
    
        public void actionPerformed(ActionEvent e) {
            Color c=(Color)getValue("ColorDeFondo");
            setBackground(c);
            System.out.println("Nombre: " + getValue(Action.NAME) + ". Descripción: " + getValue(Action.SHORT_DESCRIPTION) + ".");
        }
    }
}