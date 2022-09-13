package Básico;
import javax.swing.JOptionPane;

public class EntradaEjemplo2 {
    public static void main(String[] args) {
        String nombreUser = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad = JOptionPane.showInputDialog("Introduce tu edad");
        int edadUser = Integer.parseInt(edad);
        System.out.println("Hola " + nombreUser + ". El año que viene tendrás " + (edadUser+1) + " años.");
    }
}