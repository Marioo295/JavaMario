package Graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

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
        miLamina.setBackground(SystemColor.window);
    }
}

class LaminaConFiguras extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawRect(50, 50, 200, 200);
        //g.drawLine(100, 100, 300, 200);
        //g.drawArc(50, 50, 100, 200, 120, 150);
        Graphics2D g2=(Graphics2D) g; //Paquete Graphics 2D
        Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.RED.darker());
        g2.fill(rectangulo);
        Ellipse2D elipse=new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setPaint(Color.BLUE.brighter());
        g2.fill(elipse);
        /* g2.draw(new Line2D.Double(100, 100, 300, 250));
        double CentroenX=rectangulo.getCenterX();
        double CentroenY=rectangulo.getCenterY();
        double radio=150;
        Ellipse2D circulo=new Ellipse2D.Double();
        circulo.setFrame(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
        g2.draw(circulo); */
    }
}