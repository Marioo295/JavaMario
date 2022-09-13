package POO;

import javax.swing.JOptionPane;

public class UsoCoche {
    public static void main(String[] args) {
        Coche Renault = new Coche(4, 2000, 1000, 1600, 500); //Instanciar una clase
        Renault.setAsientosCuero(Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tiene asientos de cuero?")));
        Renault.setColor(JOptionPane.showInputDialog("Introduce color"));
        Renault.setPesoTotal(1250);
        System.out.println(Renault.toString());
    }
}