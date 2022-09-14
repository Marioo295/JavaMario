package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class SobrecargaDeConstructores {
    public static void main(String[] args) {
        /*Empleado empleado1 = new Empleado("Mario Ramos", 85000, 2022, 9, 1);
        Empleado empleado2 = new Empleado("Alejandro Ramos", 30000, 2020, 8, 20);
        Empleado empleado3 = new Empleado("Pepe Otero", 50000, 1995, 3, 16);
        empleado1.setSueldo(5);
        empleado2.setSueldo(5);
        empleado3.setSueldo(5);
        System.out.println("Nombre: " + empleado1.getNombre() + ", Sueldo: " + empleado1.getSueldo() + ", Fecha alta: " + empleado1.getAltaContrato());
        System.out.println("Nombre: " + empleado2.getNombre() + ", Sueldo: " + empleado2.getSueldo() + ", Fecha alta: " + empleado2.getAltaContrato());
        System.out.println("Nombre: " + empleado3.getNombre() + ", Sueldo: " + empleado3.getSueldo() + ", Fecha alta: " + empleado3.getAltaContrato());*/
        Empleado [] misEmpleados = new Empleado[4];
        misEmpleados[0] = new Empleado("Mario Ramos", 85000, 2022, 9, 1);
        misEmpleados[1] = new Empleado("Alejandro Ramos", 30000, 2020, 8, 20);
        misEmpleados[2] = new Empleado("Pepe Otero", 50000, 1995, 3, 16);
        misEmpleados[3] = new Empleado("Antonio Gómez");
        /*for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].setSueldo(5);
        }
        for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println("Nombre: " +misEmpleados[i].getNombre()+ ", Sueldo: " +misEmpleados[i].getSueldo()+
            ", Fecha de alta: " +misEmpleados[i].getAltaContrato());
        }*/
        for (Empleado e : misEmpleados) {
            e.setSueldo(5);
        }
        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " +e.getNombre()+ ", Sueldo: " +e.getSueldo()+
            ", Fecha de alta: " +e.getAltaContrato());
        }
    }
}

class Empleado {

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    public Empleado(String nom, double sue, int anio, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = calendario.getTime();
    }

    /*
     * Sobrecarga de constructores
     */
    public Empleado(String nom) {
        this(nom, 30000, 2000, 01, 01);
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double porcentaje) {
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }
}