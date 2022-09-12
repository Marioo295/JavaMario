import java.util.Scanner;

public class EvaluaEdad {
    public static void main(String[]args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Introduce tu edad");
            int edad = entrada.nextInt();
            if(edad>=18){
                System.out.println("Eres mayor de edad. Tienes " + edad + " años.");
            } else {
                System.out.println("Eres menor de edad. Tienes " + edad + " años.");
            }

            if(edad<18){
                System.out.println("Eres un adolescente.");
            }
            else if(edad<=40){
                System.out.println("Eres joven.");
            }
            else if(edad<=65){
                System.out.println("Eres mayor.");
            }
            else{
                System.out.println("Cuídate.");
            }
        }
    }
}