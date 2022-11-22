package Graficos;

import java.awt.*;

import javax.swing.*;

public class EjemploMenuEmergente {
    public static void main(String[] args) {
        MarcoMenuEmergente miMarco=new MarcoMenuEmergente();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoMenuEmergente extends JFrame {

    public MarcoMenuEmergente() {
        setTitle("Menú emergente");
        setBounds(550, 300, 500, 350);
        LaminaMenuEmergente miLamina=new LaminaMenuEmergente();
        add(miLamina);
    }
}

class LaminaMenuEmergente extends JPanel {

    public LaminaMenuEmergente() {
        setLayout(new BorderLayout());
        //----------------------------------------------//
        JPanel laminaMenu=new JPanel();
        //----------------------------------------------//
        JMenuBar miBarra=new JMenuBar();
        //----------------------------------------------//
        JMenu fuente=new JMenu("Fuentes");
        JMenu estilo=new JMenu("Estilos");
        JMenu tamanio=new JMenu("Tamaño");
        //----------------------------------------------//
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamanio);
        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);
        //----------------------------------------------//
        JTextPane miArea=new JTextPane();
        add(miArea, BorderLayout.CENTER);
        //----------------------------------------------//
        JPopupMenu emergente=new JPopupMenu();
        JMenuItem opcion1=new JMenuItem("Opción 1");
        JMenuItem opcion2=new JMenuItem("Opción 2");
        JMenuItem opcion3=new JMenuItem("Opción 3");
        emergente.add(opcion1);
        emergente.add(opcion2);
        emergente.add(opcion3);
        miArea.setComponentPopupMenu(emergente);
    }
}