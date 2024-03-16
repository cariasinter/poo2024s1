package cr.tec.poo.ejemplos.universidad;

import cr.tec.poo.ejemplos.universidad.entidades.Funcionario;
import cr.tec.poo.ejemplos.universidad.entidades.Vehiculo;

public class AplicacionUniversidad {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("John", "F1");
        System.out.println(f1.generarReporte());

        Vehiculo v1 = new Vehiculo("Nissan", "Almera");
        System.out.println(v1.generarReporte());

        f1.setVehiculo(v1);
        // ...
        f1 = null;

        Funcionario f2 = new Funcionario("Paul", "F2");
        f2.setVehiculo(v1);

    }
}
