package cr.tec.poo.ejemplos.universidad.entidades;

import cr.tec.poo.ejemplos.universidad.utilitarios.GeneradorDeReportes;

import java.util.Map;

public class Funcionario {

    private String nombre;
    private String id;

    private Departamento departamento;

    private Salario salario;


    private Vehiculo vehiculo;

    public Funcionario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
    public int getSalarioAnual() {
        return salario != null? salario.getMontoAnual() : 0;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String getNombreDepartamento() {
        return departamento != null ? departamento.getNombre() : "NO DEFINIDO";
    }

    // Setters
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public String generarReporte() {
        GeneradorDeReportes generadorDeReportes = new GeneradorDeReportes();
        Map<String,String> contenidos = Map.of("Id", getId(),
                "Nombre", getNombre(),
                "Departamento",  getNombreDepartamento(),
                "Salario Anual", String.valueOf(getSalarioAnual()));
        return generadorDeReportes.generarReporte("Funcionario", contenidos);
    }
}
