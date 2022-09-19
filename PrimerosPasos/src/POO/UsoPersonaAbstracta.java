package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersonaAbstracta {
    public static void main(String[] args) {
        Persona [] lasPersonas = new Persona[4];
        lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
        lasPersonas[1] = new Alumno("Pedro Porro", "Informática");
        lasPersonas[2] = new Empleado2("Juan Carlos", 70000, 2014, 9, 14);
        lasPersonas[3] = new Alumno("Maria Huana", "ADE y Derecho");

        for (Persona p : lasPersonas) {
            System.out.println(p.dameNombre() + " , " + p.dameDescripcion());
        }
    }
}

abstract class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String dameNombre() {
        return nombre;
    }

    public abstract String dameDescripcion();
    
}

class Empleado2 extends Persona {

    private double sueldo;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente;
    public Empleado2(String nombre, double sue, int anio, int mes, int dia) {
        super(nombre);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
    }

    public /*final*/ double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double porcentaje) {
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public String dameDescripcion () {
        return "Este empleado tiene un Id = " + Id + " con un sueldo = " +sueldo;
    }
}

class Alumno extends Persona {

    private String carrera;

    public Alumno(String nombre, String carrera) {
        super(nombre);
        this.carrera=carrera;
    }
    
    public String dameDescripcion () {
        return "Este alumno está estudiando la carrera de " + carrera;
    }
}