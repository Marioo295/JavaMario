package Graficos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class PruebaRadioButtonEjemplo {
    public static void main(String[] args) {
        MarcoRadio miMarco=new MarcoRadio();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoRadio extends JFrame {

    public MarcoRadio() {
        setTitle("Área de radio button ejemplo");
        setBounds(550, 300, 500, 350);
        LaminaRadio miLamina=new LaminaRadio();
        add(miLamina);
    }
}

class LaminaRadio extends JPanel {
    private JLabel texto;
    //private JRadioButton boton1, boton2, boton3, boton4;
    private ButtonGroup miGrupo;
    private JPanel laminaBotones;

    public LaminaRadio() {
        setLayout(new BorderLayout());
        texto=new JLabel("En un lugar de la Mancha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto, BorderLayout.CENTER);
        laminaBotones=new JPanel();
        miGrupo=new ButtonGroup();
        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", true, 12);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy grande", false, 24);
        add(laminaBotones, BorderLayout.SOUTH);
        /* ButtonGroup miGrupo=new ButtonGroup();
        boton1=new JRadioButton("Pequeño", false);
        boton2=new JRadioButton("Mediano", true);
        boton3=new JRadioButton("Grande", false);
        boton4=new JRadioButton("Muy grande", false);
        JPanel laminaRadio=new JPanel();
        EventoRadio miEvento=new EventoRadio();
        boton1.addActionListener(miEvento);
        boton2.addActionListener(miEvento);
        boton3.addActionListener(miEvento);
        boton4.addActionListener(miEvento);
        miGrupo.add(boton1);
        miGrupo.add(boton2);
        miGrupo.add(boton3);
        miGrupo.add(boton4);
        laminaRadio.add(boton1);
        laminaRadio.add(boton2);
        laminaRadio.add(boton3);
        laminaRadio.add(boton4);
        add(laminaRadio, BorderLayout.SOUTH); */
    }

    public void colocarBotones(String nombre, boolean seleccionado, final  int tamanio) {
        JRadioButton boton=new JRadioButton(nombre, seleccionado);
        miGrupo.add(boton);
        laminaBotones.add(boton);
        ActionListener miEvento=new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamanio));
            }
        };
        boton.addActionListener(miEvento);
    }

    /* private class EventoRadio implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==boton1) {
                //System.out.println("Has pulsado el botón pequeño");
                texto.setFont(new Font("Serif", Font.PLAIN, 10));
            } else if (e.getSource()==boton2) {
                texto.setFont(new Font("Serif", Font.PLAIN, 12));
            } else if (e.getSource()==boton3) {
                texto.setFont(new Font("Serif", Font.PLAIN, 18));
            } else if (e.getSource()==boton4) {
                texto.setFont(new Font("Serif", Font.PLAIN, 24));
            }
        }     
    } */
}