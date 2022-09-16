package POO;

public class Furgoneta extends Coche {
    private int capacidadCarga;
    private int plazasExtra;

    public Furgoneta(int capacidadCarga, int plazasExtra, int ruedas, int largo, int ancho, int motor, int pesoPlataforma) {
        super(ruedas, largo, ancho, motor, pesoPlataforma); //Llamar al constructor de la clase padre
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }

    public String dameDatosFurgoneta() {
        return "La capacidad de carga es: " + capacidadCarga + " y las plazas son : " +plazasExtra;
    }
    
}