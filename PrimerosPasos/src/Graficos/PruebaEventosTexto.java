package Graficos;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PruebaEventosTexto {
    public static void main(String[] args) {
        MarcoEventosTextos miMarco=new MarcoEventosTextos();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoEventosTextos extends JFrame {
    public MarcoEventosTextos() {
        setTitle("Eventos text field");
        setBounds(400, 300, 550, 400);
        LaminaEventosTexto miLamina=new LaminaEventosTexto();
        add(miLamina);
    }
}

class LaminaEventosTexto extends JPanel {
    private JPasswordField contra;

    public LaminaEventosTexto() {
        setLayout(new BorderLayout());
        JPanel laminaSuperior=new JPanel();
        laminaSuperior.setLayout(new GridLayout(2, 2));
        add(laminaSuperior, BorderLayout.NORTH);
        JLabel etiqueta1=new JLabel("USUARIO");
        JLabel etiqueta2=new JLabel("CONTRASEÑA");
        JTextField usuario=new JTextField(15);
        CompruebaPass miEvento=new CompruebaPass();
        contra=new JPasswordField(15);
        contra.getDocument().addDocumentListener(miEvento);
        laminaSuperior.add(etiqueta1);
        laminaSuperior.add(usuario);
        laminaSuperior.add(etiqueta2);        
        laminaSuperior.add(contra);
        JButton enviar=new JButton("Enviar");
        add(enviar, BorderLayout.SOUTH);
    }

    private class CompruebaPass implements DocumentListener {

        public void insertUpdate(DocumentEvent e) {
            char [] contrasenaEscribir;
            contrasenaEscribir=contra.getPassword();
            if (contrasenaEscribir.length<8 || contrasenaEscribir.length>12) {
                contra.setBackground(Color.RED);
            } else {
                contra.setBackground(Color.WHITE);
            }
        }

        public void removeUpdate(DocumentEvent e) {
            char [] contrasenaBorrar;
            contrasenaBorrar=contra.getPassword();
            if (contrasenaBorrar.length<8 || contrasenaBorrar.length>12) {
                contra.setBackground(Color.RED);
            } else {
                contra.setBackground(Color.WHITE);
            }
        }

        public void changedUpdate(DocumentEvent e) {

        }
    }
}