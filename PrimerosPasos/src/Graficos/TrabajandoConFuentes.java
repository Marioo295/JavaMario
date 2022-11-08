package Graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class TrabajandoConFuentes {
    public static void main(String[] args) {
        MarcoConFuentes miMarco=new MarcoConFuentes();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoConFuentes extends JFrame {
    public MarcoConFuentes() {
        setSize(400, 400);
        setTitle("Prueba con fuentes");
        LaminaConFiguras miLamina=new LaminaConFiguras();
        add(miLamina);
        //miLamina.setForeground(Color.BLUE);
    }
}

class LaminaConFiguras extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g; //Paquete Graphics 2D
        Font miFuente=new FontUIResource("Arial", Font.BOLD, 26);
        g2.setFont(miFuente);
        g2.setColor(Color.BLUE);
        g2.drawString("Mario", 100, 100);
        g2.setFont(new Font("Courier", Font.ITALIC, 18));
        g2.setColor(new Color(128, 90, 50).brighter());
        g2.drawString("Cursillo", 100, 200);
    }
}