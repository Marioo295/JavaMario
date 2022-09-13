import javax.swing.JOptionPane;

public class ForEvaluaEmail {
    public static void main(String[] args) {
        boolean arroba = false;
        String mail = JOptionPane.showInputDialog("Introduce el mail");
        for (int i = 0; i < mail.length() ; i++) {
            if (mail.charAt(i)=='@') {
                arroba = true;
            }
        }
        if (arroba==true) {
            System.out.println("Email CORRECTO");
        }else{
            System.out.println("Email INCORRECTO");
        }
    }
}