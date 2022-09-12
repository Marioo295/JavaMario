import java.util.Scanner;

public class EntradaEjemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombreUser = entrada.nextLine();
        System.out.println("Introduce tu edad");
        int edad = entrada.nextInt();
        System.out.println("Hola " + nombreUser + ". El año que viene tendrás " + (edad+1) + " años.");
    }
}