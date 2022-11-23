package Graficos;

import javax.swing.*;

import java.awt.event.*;

public class TiposCuadrosDialogos {
    public static void main(String[] args) {
        CuadrosDialogos miMarco=new CuadrosDialogos();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class CuadrosDialogos extends JFrame {
    public CuadrosDialogos() {
        setTitle("Botones y eventos");
        setBounds(500, 300, 400, 250);
        LaminaCuadrosDialogos miLamina=new LaminaCuadrosDialogos();
        add(miLamina);
    }
}

class LaminaCuadrosDialogos extends JPanel {
    JButton boton1=new JButton("Botón 1");
    JButton boton2=new JButton("Botón 2");
    JButton boton3=new JButton("Botón 3");
    JButton boton4=new JButton("Botón 4");

    public LaminaCuadrosDialogos() {
        boton1.addActionListener(new AccionBotones());
        boton2.addActionListener(new AccionBotones());
        boton3.addActionListener(new AccionBotones());
        boton4.addActionListener(new AccionBotones());
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
    }
    
    private class AccionBotones implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==boton1) {
                //System.out.println("Has pulsado el botón 1.");
                //JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this, "Has pulsado el botón 1");
                JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this, "Has pulsado el botón 1", "Advertencia", 0);
            } else if (e.getSource()==boton2) {
                //System.out.println("Has pulsado el botón 2.");
                JOptionPane.showInputDialog(LaminaCuadrosDialogos.this, "Introduce tu nombre", "Introducción de datos", 2);
            } else if (e.getSource()==boton3) {
                //System.out.println("Has pulsado el botón 3.");
                JOptionPane.showConfirmDialog(LaminaCuadrosDialogos.this, "Elige opción", "Confirmar", 1);
            } else {
                //System.out.println("Has pulsado el botón 4.");
                JOptionPane.showOptionDialog(LaminaCuadrosDialogos.this, "Elige", "Opciones", 1, 1, null, null, null);
            }
        }  
    }
}