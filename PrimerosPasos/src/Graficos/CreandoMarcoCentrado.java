package Graficos;

import java.awt.*;
import javax.swing.*;

public class CreandoMarcoCentrado {
    public static void main(String[] args) {
        MarcoCentrado miMarco=new MarcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCentrado extends JFrame {
    public MarcoCentrado() {
        Toolkit miPantalla=Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla=miPantalla.getScreenSize();
        int alturaPantalla=tamanoPantalla.height;
        int anchoPantalla=tamanoPantalla.width;
        setSize(alturaPantalla/2, anchoPantalla/2);
        setLocation(alturaPantalla/4, anchoPantalla/4);
        setTitle("Marco centrado");
        Image miIcono=miPantalla.getImage("C:/Users/Usuario/Desktop/JavaMario/JavaMario/PrimerosPasos/src/Graficos/icono.png");
        setIconImage(miIcono);
    }
}