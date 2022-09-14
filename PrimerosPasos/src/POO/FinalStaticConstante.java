package POO;

public class FinalStaticConstante {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Antonio");
        Empleados trabajador4 = new Empleados("Fernando");
        trabajador1.setSeccion("RRHH");
        System.out.println(trabajador1.getDatos() + "\n" + trabajador2.getDatos() + 
        "\n" + trabajador3.getDatos() + "\n" + trabajador4.getDatos());
        System.out.println(Empleados.dameIdSiguiente());
    }
}

class Empleados {
    private final String NOMBRE;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;

    public Empleados(String nom) {
        NOMBRE = nom;
        seccion = "Administracion";
        id=idSiguiente;
        idSiguiente++;
    }

    public String getDatos(){
        return "El nombre es: " +NOMBRE+ " y la sección es " +seccion+ " y el ID = " +id+ ".";
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    /*
     * Los métodos static no actúan sobre objetos.
     * No acceden a campos de ejemplar(variables/constantes), a menos que sean también static
     * Para llamarlos se utiliza el nombreClase.nombreMetodo
     */
    public static String dameIdSiguiente() {
        return "El IdSiguiente es: " +idSiguiente;
    }
}