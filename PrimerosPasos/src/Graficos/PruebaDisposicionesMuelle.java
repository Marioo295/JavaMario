package Graficos;

import javax.swing.*;

public class PruebaDisposicionesMuelle {
    public static void main(String[] args) {
        MarcoMuelle miMarco=new MarcoMuelle();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoMuelle extends JFrame {
    public MarcoMuelle() {
        setTitle("Marco en la caja de muelle");
        setBounds(300, 400, 1000, 350);
        LaminaMuelle miLamina=new LaminaMuelle();
        add(miLamina);    
    }
}

class LaminaMuelle extends JPanel {
    public LaminaMuelle() {
        JButton bot1=new JButton("Botón 1");
        JButton bot2=new JButton("Botón 2");
        JButton bot3=new JButton("Botón 3");
        SpringLayout miLayout=new SpringLayout();
        setLayout(miLayout);
        add(bot1);
        add(bot2);
        add(bot3);
        //----------------------------------------------------// 
        Spring miMuelle=Spring.constant(0, 10, 100); //Muelle elásticos
        Spring muelleRigido=Spring.constant(10); //Muelle rígido
        miLayout.putConstraint(SpringLayout.WEST, bot1, miMuelle, SpringLayout.WEST, this);
        miLayout.putConstraint(SpringLayout.WEST, bot2, muelleRigido, SpringLayout.EAST, bot1);
        miLayout.putConstraint(SpringLayout.WEST, bot3, muelleRigido, SpringLayout.EAST, bot2);
        miLayout.putConstraint(SpringLayout.EAST, this, miMuelle, SpringLayout.EAST, bot3);
    }
}