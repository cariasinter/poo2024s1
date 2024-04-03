package cr.tec.poo.ejemplos.ocultamientoinformacion;

public class PruebaMiJardin {

    public static void main(String[] args) {
        MiJardin j = new MiJardin("turquesa");
        j.observar();
        boolean puedoObservar = j.solicitarVisita();
        if (puedoObservar) {
            j.observar();
            j.finalizarVisita();
        } else {
            System.out.println("No me dejaron :(");
        }
    }
}
