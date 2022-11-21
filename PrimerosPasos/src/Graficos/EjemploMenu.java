package Graficos;

import java.awt.*;

import javax.swing.*;

public class EjemploMenu {
    public static void main(String[] args) {
        MarcoMenu miMarco=new MarcoMenu();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoMenu extends JFrame {

    public MarcoMenu() {
        setTitle("Menú");
        setBounds(550, 300, 500, 350);
        LaminaMenu miLamina=new LaminaMenu();
        add(miLamina);
    }
}

class LaminaMenu extends JPanel {

    public LaminaMenu() {
        JMenuBar miBarra=new JMenuBar();
        JMenu archivo=new JMenu("Archivo");
        JMenu edicion=new JMenu("Edición");
        JMenu herramientas=new JMenu("Herramientas");
        JMenu opciones=new JMenu("Opciones");
        JMenuItem guardar=new JMenuItem("Guardar");
        JMenuItem guardarcomo=new JMenuItem("Guardar como");
        JMenuItem cortar=new JMenuItem("Cortar");
        JMenuItem copiar=new JMenuItem("Copiar");
        JMenuItem pegar=new JMenuItem("Pegar");
        JMenuItem generales=new JMenuItem("Generales");
        JMenuItem op1=new JMenuItem("Opción 1");
        JMenuItem op2=new JMenuItem("Opción 2");
        archivo.add(guardar);
        archivo.add(guardarcomo);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator(); //Añadir una línea separatoria
        herramientas.add(generales);
        opciones.add(op1);
        opciones.add(op2);
        edicion.add(opciones);
        miBarra.add(archivo);
        miBarra.add(edicion);
        miBarra.add(herramientas);
        add(miBarra);
    }
}