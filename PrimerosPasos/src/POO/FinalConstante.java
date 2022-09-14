package POO;

public class FinalConstante {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        trabajador1.setSeccion("RRHH");
        System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());
    }
}

class Empleados {
    private final String NOMBRE;
    private String seccion;

    public Empleados(String nom) {
        NOMBRE = nom;
        seccion = "Administracion";
    }

    public String getDatos(){
        return "El nombre es: " +NOMBRE+ " y la sección es " +seccion+ ".";
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}