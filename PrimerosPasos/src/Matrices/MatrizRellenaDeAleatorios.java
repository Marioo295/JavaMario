package Matrices;
public class MatrizRellenaDeAleatorios {
    public static void main(String[] args) {
        int [] aleatorios = new int[100];
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i]=(int)Math.round(Math.random()*100);
        }
        for (int numeros : aleatorios) {
            System.out.print(numeros + " ");
        }
    }
}