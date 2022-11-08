package Graficos;

import java.awt.*;
import javax.swing.*;

public class PruebaDibujo {
    public static void main(String[] args) {
        MarcoConDibujos miMarco=new MarcoConDibujos();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujos extends JFrame {
    public MarcoConDibujos() {
        setVisible(true);
        setSize(400, 400);
        setTitle("Prueba dibujo");
        LaminaConFiguras miLamina=new LaminaConFiguras();
        add(miLamina);
    }
}

class LaminaConFiguras extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawRect(50, 50, 200, 200);
        //g.drawLine(100, 100, 300, 200);
        g.drawArc(50, 50, 100, 200, 120, 150);
    }
}