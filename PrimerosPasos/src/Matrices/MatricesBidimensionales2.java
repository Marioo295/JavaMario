package Matrices;

public class MatricesBidimensionales2 {
    public static void main(String[] args) {
        int [][] matriz ={ {5,0,3,4,9}, {27,4,-3,30,80}, {40,97,60,-4,9}, {35,70,-36,-50,71} };
       for(int[] fila:matriz){
            System.out.println();
            for (int z:fila) {
                System.out.print(z + " ");
            }
        }
    }
}