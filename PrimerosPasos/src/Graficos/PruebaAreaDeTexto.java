package Graficos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class PruebaAreaDeTexto {
    public static void main(String[] args) {
        MarcoTexto miMarco=new MarcoTexto();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoTexto extends JFrame {
    private JPanel laminaBotones;
    private JButton botonIns, botonSaltoLinea;
    private JTextArea areaTexto;
    private JScrollPane laminaConBarras;

    public MarcoTexto() {
        setTitle("Área de texto");
        setBounds(500, 300, 500, 350);
        setLayout(new BorderLayout());
        laminaBotones=new JPanel();
        botonIns=new JButton("Insertar");
        botonIns.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme...");
            }
        });

        laminaBotones.add(botonIns);
        botonSaltoLinea=new JButton("Salto de línea");
        botonSaltoLinea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean saltar=!areaTexto.getLineWrap();
                areaTexto.setLineWrap(saltar);
                if (saltar) {
                    botonSaltoLinea.setText("Quitar salto");
                } else {
                    botonSaltoLinea.setText("Salto de línea");
                }
            }
        });

        laminaBotones.add(botonSaltoLinea);
        add(laminaBotones, BorderLayout.SOUTH);
        areaTexto=new JTextArea(8, 20);
        laminaConBarras=new JScrollPane(areaTexto);
        add(laminaConBarras, BorderLayout.CENTER);
    }
}