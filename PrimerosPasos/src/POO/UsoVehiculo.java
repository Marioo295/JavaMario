package POO;

public class UsoVehiculo {
    public static void main(String[] args) {
        /* 
        ESTE CÓDIGO ES DE LA CLASE USOCOCHE
        Coche Renault = new Coche(4, 2000, 1000, 1600, 500); //Instanciar una clase
        Renault.setAsientosCuero(Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tiene asientos de cuero?")));
        Renault.setColor(JOptionPane.showInputDialog("Introduce color"));
        Renault.setPesoTotal(1250);
        System.out.println(Renault.toString()); */
        Coche coche1 = new Coche(4, 2000, 1000, 1600, 700);
        coche1.setColor("Rojo");
        Furgoneta furgo1 = new Furgoneta(580, 7, 4, 3000, 2000, 2000, 950);
        furgo1.setColor("Azul");
        furgo1.setAsientosCuero(true);
        System.out.println(coche1.toString() + " " + coche1.getColor());
        System.out.println(furgo1.toString() + furgo1.dameDatosFurgoneta());
    }
}