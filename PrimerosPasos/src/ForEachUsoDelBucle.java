import javax.swing.JOptionPane;

public class ForEachUsoDelBucle {
    public static void main(String[] args) {
        String [] paises = new String[8];
        /*
        paises[0]="España";
        paises[1]="México";
        paises[2]="Argentina";
        paises[3]="Colombia";
        paises[4]="Italia";
        paises[5]="Portugal";
        paises[6]="Brasil";
        paises[7]="Ucrania";
        String [] paises = {"España", "México", "Argentina", "Colombia", "Italia", "Portugal", "Brasil", "Ucrania"};
        for (int i = 0; i < paises.length; i++) {
        System.out.println("País " +(i+1) + " " + paises[i]);
        }
         */
        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce un país " + (i+1));
        }
        for(String elemento:paises){
            System.out.println("País: " + elemento);
        }
    }    
}