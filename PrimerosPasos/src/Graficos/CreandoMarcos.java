package Graficos;

import javax.swing.*;

public class CreandoMarcos {
    public static void main(String[] args) {
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class miMarco extends JFrame {

    public miMarco() {
        //setSize(500, 300); //Cambiar tamaño
        //setLocation(500, 300); //Cambiar posición inicial
        setBounds(500, 300, 550, 250); //Ajustar marco de ventana
        //setResizable(false); //Permitir mover el tamaño
        //setExtendedState(Frame.MAXIMIZED_BOTH); //Maximizar
        setTitle("Mi ventana"); //Poner título
    }
}