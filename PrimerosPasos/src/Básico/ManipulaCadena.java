package Básico;
public class ManipulaCadena {
    public static void main(String[]args) {
        String nombre="Mario Ramos Esquinas";

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre es " + nombre.length() + " letras");
        System.out.println("La primera letra de mi " + nombre + " es " + nombre.charAt(0));
        int utlLetra=nombre.length();
        System.out.println("La última letra de mi nombre es " + nombre.charAt(utlLetra-1));
    }
}
