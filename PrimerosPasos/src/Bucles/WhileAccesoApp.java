package Bucles;
import javax.swing.JOptionPane;

public class WhileAccesoApp {
    public static void main(String[] args) {
        String clave = "mario";
        String pass = "";
        while(clave.equals(pass)==false){
            pass = JOptionPane.showInputDialog("Introduce la contraseña");
            if(clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta. Acceso permitido");
    }
}