package Graficos;

import java.awt.*;

import javax.swing.*;

public class PruebaDisposicionesLibres {
    public static void main(String[] args) {
        MarcoLibre miMarco=new MarcoLibre();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoLibre extends JFrame {
    public MarcoLibre() {
        setTitle("Marco en la caja de muelle");
        setBounds(450, 350, 800, 400);
        LaminaLibre miLamina=new LaminaLibre();
        add(miLamina);    
    }
}

class LaminaLibre extends JPanel {
    public LaminaLibre() {
        //setLayout(null);
        setLayout(new EnColumnas());
        /* JButton bot1=new JButton("Botón 1");
        JButton bot2=new JButton("Botón 2");
        bot1.setBounds(50, 50, 120, 25);
        bot2.setBounds(200, 100, 120, 25);
        add(bot1);
        add(bot2); */
        JLabel nombre=new JLabel("Nombre: ");
        JLabel apellido=new JLabel("Apellidos: ");
        JLabel edad=new JLabel("Edad: ");
        JLabel tel=new JLabel("Teléfono: ");
        JTextField cNombre=new JTextField(10);
        JTextField cApellido=new JTextField(10);
        JTextField cEdad=new JTextField(10);
        JTextField cTel=new JTextField(10);
        //----------------------------------------------------// 
        /* nombre.setBounds(20, 20, 80, 10);
        apellido.setBounds(20, 60, 80, 15);
        cNombre.setBounds(100, 20, 100, 20);
        cApellido.setBounds(100, 55, 100, 20); */
        //----------------------------------------------------// 
        add(nombre);
        add(cNombre);
        add(apellido);
        add(cApellido);
        add(edad);
        add(cEdad);
        add(tel);
        add(cTel);
    }
}

class EnColumnas implements LayoutManager {
    private int x;
    private int y=20;

    public void layoutContainer(Container miContenedor) {
        int contador=0;
        int d=miContenedor.getWidth();
        x=d/2;
        int n=miContenedor.getComponentCount();
        for (int i = 0; i < n; i++) {
            contador++;
            Component c=miContenedor.getComponent(i);
            c.setBounds(x-100, y, 100, 20);
            x+=100;
            if (contador%2==0) {
                x=d/2;
                y+=40;
            }
        }
    }

    public void addLayoutComponent(String name, Component comp) {}

    public void removeLayoutComponent(Component comp) {}

    public Dimension preferredLayoutSize(Container parent) {return null;}

    public Dimension minimumLayoutSize(Container parent) {return null;}
}