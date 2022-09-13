import javax.swing.JOptionPane;

public class ForFactorial {
    public static void main(String[] args) {
        Long resultado = 1L;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for (int i = numero; i > 0; i--) {
            resultado *= i;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}