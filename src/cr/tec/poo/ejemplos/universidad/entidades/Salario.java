package cr.tec.poo.ejemplos.universidad.entidades;

public class Salario {

    private int montoMensual;

    private boolean tieneAguinaldo;

    public Salario(int montoMensual, boolean tieneAguinaldo) {
        this.montoMensual = montoMensual;
        this.tieneAguinaldo = tieneAguinaldo;
    }

    public int getMontoMensual() {
        return montoMensual;
    }

    public int getMontoAnual() {
        return  tieneAguinaldo? montoMensual * 13 : montoMensual * 12;
    }
}
