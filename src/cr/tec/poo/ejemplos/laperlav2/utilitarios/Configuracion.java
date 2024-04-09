package cr.tec.poo.ejemplos.laperlav2.utilitarios;

public class Configuracion {

    private int numeroInicialDeFactura;
    private float porcentajeIVA;

    public Configuracion() {
        numeroInicialDeFactura = 180;
        porcentajeIVA = 0.13f;
        // En la práctica los dos valores anteriores deberían obtenerse de algún archivo o repositorio
        // de configuración
    }

    public int getNumeroInicialDeFactura() {
        return numeroInicialDeFactura;
    }

    public float getPorcentajeIVA() {
        return porcentajeIVA;
    }

    public void actualizarNumeroActualDeFactura(int numeroFactura) {
        numeroInicialDeFactura = numeroFactura;
        // En la práctica, se guarda también este dato en el archivo
    }
}
