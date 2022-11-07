package POO;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {
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
        
        Jefatura jefeRRHH = new Jefatura("María Ángeles", 100000, 1990, 5, 14);
        jefeRRHH.setIncentivo(2570);
        Empleado [] misEmpleados = new Empleado[5];
        misEmpleados[0] = new Empleado("Mario Ramos", 85000, 2022, 9, 1);
        misEmpleados[1] = new Empleado("Alejandro Ramos", 30000, 2020, 8, 20);
        misEmpleados[2] = new Empleado("Pepe Otero", 50000, 1995, 3, 16);
        misEmpleados[3] = jefeRRHH; //POLIMORFISMO EN ACCIÓN. PRINCIPIO DE SUSTITUCIÓN
        misEmpleados[4] = new Jefatura("Juana de Arco", 95000, 1999, 5, 26);
        Jefatura jefaFinanzas = (Jefatura) misEmpleados[4]; //Casting de objetos para poder utilizar métodos de otras clases
        jefaFinanzas.setIncentivo(55000);

        System.out.println(jefaFinanzas.tomarDecisiones("Dar más días de vacaciones a los empleados"));

        System.out.println("El jefe " + jefaFinanzas.getNombre() + " tiene un bonus de " + jefaFinanzas.estableceBonus(500));

        System.out.println(misEmpleados[3].getNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200));

        /*for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].setSueldo(5);
        }
        for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println("Nombre: " +misEmpleados[i].getNombre()+ ", Sueldo: " +misEmpleados[i].getSueldo()+
            ", Fecha de alta: " +misEmpleados[i].getAltaContrato());
        }*/

        Arrays.sort(misEmpleados);

        for (Empleado e : misEmpleados) {
            e.setSueldo(5);
        }

        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " +e.getNombre()+ ", Sueldo: " +e.getSueldo()+
            ", Fecha de alta: " +e.getAltaContrato());
        }
    }
}

/*final*/ class Empleado implements Comparable, Trabajadores {

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    public Empleado(String nom, double sue, int anio, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = calendario.getTime();
    }

    public double estableceBonus(double gratificacion){
        return Trabajadores.bonusBase+gratificacion;
    }

    public String getNombre() {
        return nombre;
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

    @Override
    public int compareTo(Object miObjeto) {
        Empleado otroEmpleado = (Empleado) miObjeto;
        if (this.sueldo<otroEmpleado.sueldo) {
            return -1;
        }
        if (this.sueldo>otroEmpleado.sueldo) {
            return 1;
        }
        return 0;
    }
}

class Jefatura extends Empleado implements Jefes {
    private double incentivo;

    public Jefatura(String nom, double sue, int anio, int mes, int dia) {
        super(nom, sue, anio, mes, dia);
    }

    public String tomarDecisiones(String decision){
        return "Un miembro de la dirección ha tomado la decisión de " + decision;
    }

    public double estableceBonus(double gratificacion){
        double prima=2000;
        return Trabajadores.bonusBase+gratificacion+prima;
    }

    public double getSueldo() {
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
}