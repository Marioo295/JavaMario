package Básico;
public class MathCalculos {
    public static void main(String[] args){
        //double raiz=Math.sqrt(9);
        //double num1=5.85;
        //int resultado=(int) Math.round(num1);
        double base=5;
        double exponente=3;
        double resultado=Math.pow(base, exponente);
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado); 
    }
}