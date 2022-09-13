package Matrices;

public class MatricesBidimensionales {
    public static void main(String[] args) {
        int [][] matriz = new int[4][5];
        matriz[0][0] = 5;
        matriz[0][1] = 0;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[0][4] = 9;

        matriz[1][0] = 27;
        matriz[1][1] = 4;
        matriz[1][2] = -3;
        matriz[1][3] = 30;
        matriz[1][4] = 80;

        matriz[2][0] = 40;
        matriz[2][1] = 97;
        matriz[2][2] = 62;
        matriz[2][3] = -4;
        matriz[2][4] = -9;

        matriz[3][0] = 35;
        matriz[3][1] = 70;
        matriz[3][2] = -36;
        matriz[3][3] = -50;
        matriz[3][4] = 71;

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}