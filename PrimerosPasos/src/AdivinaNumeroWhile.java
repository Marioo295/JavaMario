import java.util.Scanner;

public class AdivinaNumeroWhile {
    public static void main(String[] args) {
        int aleatorio = (int)(Math.random()*100);
        try (Scanner entrada = new Scanner(System.in)) {
            int numero = 0, intentos = 0;
            while(numero!=aleatorio){
                intentos++;
                System.out.print("Introduce un número: ");
                numero = entrada.nextInt();
                if (aleatorio<numero) {
                    System.out.println("Más bajo...");
                }else if (aleatorio>numero) {
                    System.out.println("Más alto...");
                }
            }
        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");
        }
    }
}