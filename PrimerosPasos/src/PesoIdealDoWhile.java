import javax.swing.JOptionPane;

public class PesoIdealDoWhile {
    public static void main(String[] args) {
        String genero = "";
        do{
            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en centímetros"));
                int pesoIdeal=0;
                if (genero.equalsIgnoreCase("H")) {
                    pesoIdeal = altura - 110;
                }else if (genero.equalsIgnoreCase("M")) {
                    pesoIdeal = altura - 120;
                }
                System.out.println("Tu peso idead es " + pesoIdeal);
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
    }
}