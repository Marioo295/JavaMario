package Básico;

import java.util.*;

public class TiposEnumerados {

    //No podemos hacer una instancia de un grupo enumerado y siempre hay que hacerlos fuera del main
    /* enum Talla {PEQUEÑA, MEDIANA, GRANDE, MUY_GRANDE}; */
    enum Talla {
        PEQUENIA("S"), MEDIANA("M"), GRANDE("L"), MUY_GRANDE("XL");
        private Talla(String abreviatura) {
            this.abreviatura=abreviatura;
        }
        
        public String getAbreviatura() {
            return abreviatura;
        }

        private String abreviatura;
    }

    public static void main(String[] args) {
        /* Talla S = Talla.PEQUEÑA;
        Talla M = Talla.MEDIANA;
        Talla L = Talla.GRANDE;
        Talla XL = Talla.MUY_GRANDE; */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: PEQUENIA, MEDIANA, GRANDE, MUY_GRANDE");
        String entrada_datos = entrada.next().toUpperCase();
        Talla laTalla = Enum.valueOf(Talla.class, entrada_datos);
        System.out.println("Talla = " + laTalla + " con una abreviatura de " + laTalla.getAbreviatura());
    }
}