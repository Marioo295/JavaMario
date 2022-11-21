package Graficos;

import java.awt.*;

import javax.swing.*;

public class PruebaSpinners {
    public static void main(String[] args) {
        MarcoSpinners miMarco=new MarcoSpinners();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoSpinners extends JFrame {

    public MarcoSpinners() {
        setTitle("Área de spinners");
        setBounds(550, 300, 500, 350);
        LaminaSpinners miLamina=new LaminaSpinners();
        add(miLamina);
    }
}

class LaminaSpinners extends JPanel {

    public LaminaSpinners() {
        JSpinner control=new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) { //Clase interna anónima
            public Object getNextValue() {
                return super.getPreviousValue();
            }
    
            public Object getPreviousValue() {
                return super.getNextValue();
            }
        });
        Dimension d=new Dimension(200, 20);
        control.setPreferredSize(d);
        add(control);
    }

    /* private class MiModeloSpinner extends SpinnerNumberModel {
        public MiModeloSpinner() {
            super(5, 0, 10, 1);
        }

        public Object getNextValue() {
            return super.getPreviousValue();
        }

        public Object getPreviousValue() {
            return super.getNextValue();
        }
    } */
}