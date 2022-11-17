package Graficos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class PruebaTexto {
    public static void main(String[] args) {
        MarcoTexto miMarco=new MarcoTexto();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoTexto extends JFrame {
    public MarcoTexto() {
        setTitle("Text field");
        setBounds(600, 300, 600, 350);
        LaminaTexto miLamina=new LaminaTexto();
        add(miLamina);
    }
}

class LaminaTexto extends JPanel {
    private JTextField campo1;
    private JLabel resultado;

    public LaminaTexto() {
        setLayout(new BorderLayout());
        JPanel miLamina2=new JPanel();
        miLamina2.setLayout(new FlowLayout());
        resultado=new JLabel("", JLabel.CENTER);
        JLabel texto1=new JLabel("Email: ");
        miLamina2.add(texto1);
        campo1=new JTextField(20);
        miLamina2.add(campo1);
        add(resultado, BorderLayout.CENTER);
        System.out.println(campo1.getText().trim());
        JButton miBoton=new JButton("Comprobar");
        DameTexto miEvento=new DameTexto();
        miBoton.addActionListener(miEvento);
        miLamina2.add(miBoton);
        add(miLamina2, BorderLayout.NORTH);
    }

    private class DameTexto implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int correcto=0;
            String email=campo1.getText().trim();
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i)=='@') {
                    correcto++;
                }
            }
            if (correcto!=1) {
                resultado.setText("Incorrecto");
            } else {
                resultado.setText("Correcto");
            }
        }
    }
}