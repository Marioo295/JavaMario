package Graficos;

import javax.swing.*;

public class PruebaRadioButton {
    public static void main(String[] args) {
        MarcoRadio miMarco=new MarcoRadio();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoRadio extends JFrame {

    public MarcoRadio() {
        setTitle("Área de radio button");
        setBounds(550, 300, 500, 350);
        LaminaRadio miLamina=new LaminaRadio();
        add(miLamina);
    }
}

class LaminaRadio extends JPanel {

    public LaminaRadio() {
        ButtonGroup miGrupo1=new ButtonGroup();
        ButtonGroup miGrupo2=new ButtonGroup();
        JRadioButton boton1=new JRadioButton("Azul", false);
        JRadioButton boton2=new JRadioButton("Rojo", true);
        JRadioButton boton3=new JRadioButton("Verde", false);
        JRadioButton boton4=new JRadioButton("Masculino", false);
        JRadioButton boton5=new JRadioButton("Femenino", false);
        miGrupo1.add(boton1);
        miGrupo1.add(boton2);
        miGrupo1.add(boton3);
        miGrupo2.add(boton4);
        miGrupo2.add(boton5);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
    }

}