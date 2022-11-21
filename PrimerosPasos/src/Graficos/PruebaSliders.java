package Graficos;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PruebaSliders {
    public static void main(String[] args) {
        MarcoSliders miMarco=new MarcoSliders();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoSliders extends JFrame {

    public MarcoSliders() {
        setTitle("Área de sliders");
        setBounds(550, 300, 500, 350);
        LaminaSliders miLamina=new LaminaSliders();
        add(miLamina);
    }
}

class LaminaSliders extends JPanel {
    private JLabel rotulo;
    private JSlider control;

    public LaminaSliders() {
        setLayout(new BorderLayout());
        rotulo=new JLabel("En un lugar de la Mancha de cuyo nombre...");
        add(rotulo, BorderLayout.CENTER);
        control=new JSlider(8, 50, 12);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        control.setPaintLabels(true);
        //control.setSnapToTicks(true);
        control.addChangeListener(new EventoSlider());
        JPanel laminaSlider=new JPanel();
        laminaSlider.add(control);
        add(laminaSlider, BorderLayout.NORTH);
    }

    private class EventoSlider implements ChangeListener {

        public void stateChanged(ChangeEvent e) {
            rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
        }       
    }
}