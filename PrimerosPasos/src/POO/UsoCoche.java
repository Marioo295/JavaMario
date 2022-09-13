package POO;

public class UsoCoche {
    public static void main(String[] args) {
        Coche Renault = new Coche(4, 2000, 300, 1600, 500);
        System.out.println("Este coche tiene " +Renault.ruedas+ " ruedas. Mide " +Renault.largo+ " de largo y " +Renault.ancho+ " de ancho. Tiene un motor " +Renault.motor+ " con un peso de " +Renault.peso+ " kilos.");
    }
}