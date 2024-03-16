package cr.tec.poo.ejemplos.universidad.entidades;

import java.util.List;

public class Departamento {

    private String nombre;
    private Funcionario encargado;
    private List<Funcionario> funcionarios;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Funcionario getEncargado() {
        return encargado;
    }

    public void setEncargado(Funcionario encargado) {
        this.encargado = encargado;
    }
}
