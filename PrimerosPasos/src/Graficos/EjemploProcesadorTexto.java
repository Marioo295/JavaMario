package Graficos;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class EjemploProcesadorTexto {
    public static void main(String[] args) {
        MenuProcesador miMarco=new MenuProcesador();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MenuProcesador extends JFrame {

    public MenuProcesador() {
        setTitle("Procesador de texto");
        setBounds(550, 300, 500, 350);
        LaminaProcesador miLamina=new LaminaProcesador();
        add(miLamina);
    }
}

class LaminaProcesador extends JPanel {
    private JTextPane miArea;
    private JMenu fuente, estilo, tamanio;
    private Font letras;

    public LaminaProcesador() {
        setLayout(new BorderLayout());
        //----------------------------------------------//
        JPanel laminaMenu=new JPanel();
        //----------------------------------------------//
        JMenuBar miBarra=new JMenuBar();
        //----------------------------------------------//
        fuente=new JMenu("Fuentes");
        estilo=new JMenu("Estilos");
        tamanio=new JMenu("Tamaño");
        //----------------------------------------------//
        configuraMenu("Arial", "fuente", "Arial", 9, 10);
        configuraMenu("Courier", "fuente", "Courier", 9, 10);
        configuraMenu("Verdana", "fuente", "Verdana", 9, 10);
        //----------------------------------------------//
        configuraMenu("Negrita", "estilo", "", Font.BOLD, 1);
        configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1);
        //----------------------------------------------//
        configuraMenu("12", "tamaño", "", 9, 12);
        configuraMenu("16", "tamaño", "", 9, 16);
        configuraMenu("20", "tamaño", "", 9, 20);
        configuraMenu("24", "tamaño", "", 9, 24);
        //----------------------------------------------//
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamanio);
        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);
        //----------------------------------------------//
        miArea=new JTextPane();
        add(miArea, BorderLayout.CENTER);
    }

    public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {
        JMenuItem elemMenu=new JMenuItem(rotulo);
        if (menu=="fuente") {
            fuente.add(elemMenu);
        } else if (menu=="estilo") {
            estilo.add(elemMenu);
        } else if (menu=="tamaño") {
            tamanio.add(elemMenu);
        }

        elemMenu.addActionListener(new GestionaEventos(rotulo, tipoLetra, estilos, tam));
    }

    private class GestionaEventos implements ActionListener {
        String tipoTexto, menu;
        int estiloLetra, tamanioLetra;

        GestionaEventos(String elemento, String texto2, int estilo2, int tamLetra) {
            tipoTexto=texto2;
            estiloLetra=estilo2;
            tamanioLetra=tamLetra;
            menu=elemento;
        }

        public void actionPerformed(ActionEvent e) {
            letras=miArea.getFont();

            if (menu=="Arial" || menu=="Courier" || menu=="Verdana") {
                estiloLetra=letras.getStyle();
                tamanioLetra=letras.getSize();
            } else if (menu=="Cursiva" || menu=="Negrita") {
                if (letras.getStyle()==1 || letras.getStyle()==2) {
                    estiloLetra=3;
                }
                tipoTexto=letras.getFontName();
                tamanioLetra=letras.getSize();
            } else if (menu=="12" || menu=="16" || menu=="20" || menu=="24") {
                estiloLetra=letras.getStyle();
                tipoTexto=letras.getFontName();
            }

            miArea.setFont(new Font(tipoTexto, estiloLetra, tamanioLetra));

            System.out.println("Tipo: " + tipoTexto + ". Estilo: " + estiloLetra + ". Tamaño: " + tamanioLetra);
        }  
    }
}