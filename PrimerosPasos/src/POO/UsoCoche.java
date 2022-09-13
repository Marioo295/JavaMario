package POO;

public class UsoCoche {
    public static void main(String[] args) {
        Coche Renault = new Coche(4, 2000, 1000, 1600, 500); //Instanciar una clase
        Renault.setColor("azul");
        Renault.setAsientosCuero(true);
        System.out.println("Este coche tiene " + Renault.getRuedas() + " ruedas. Mide " + Renault.getLargo()/1000 + " metros de largo y " + Renault.getAncho()/1000 + " metros de ancho. Tiene un motor " + Renault.getMotor() + " con un peso de " + Renault.getPesoPlataforma() + 
        " kilos. El color del coche es " + Renault.getColor() + " y tiene asientos de cuero " + Renault.getAsientosCuero());
    }
}