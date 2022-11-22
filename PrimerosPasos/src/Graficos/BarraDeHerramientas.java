package Graficos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class BarraDeHerramientas {
    public static void main(String[] args) {
        MarcoBarra miMarco=new MarcoBarra();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoBarra extends JFrame {
    private JPanel miLamina;

    public MarcoBarra() {
        setTitle("Marco con barra de herramientas");
        setBounds(600, 350, 600, 300);
        miLamina=new JPanel();
        add(miLamina);
        //Configuración de acciones
        Action accionAzul=new AccionColor("Azul", Color.BLUE);
        Action accionAmarillo=new AccionColor("Amarillo", Color.YELLOW);
        Action accionRojo=new AccionColor("Rojo", Color.RED);
        Action accionSalir=new AbstractAction("Salir") {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        JMenu menu=new JMenu("Color");
        menu.add(accionAzul);
        menu.add(accionAmarillo);
        menu.add(accionRojo);
        JMenuBar barraMenu=new JMenuBar();
        barraMenu.add(menu);
        setJMenuBar(barraMenu);
        //Construcción de la barra de herramientas
        JToolBar barra=new JToolBar();
        barra.add(accionAzul);
        barra.add(accionAmarillo);
        barra.add(accionRojo);
        barra.addSeparator();
        barra.add(accionSalir);
        add(barra, BorderLayout.NORTH);
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