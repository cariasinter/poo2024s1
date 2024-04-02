package cr.tec.poo.ejemplos.ocultamientoinformacion;

public class PruebaMiJardin {

    public static void main(String[] args) {
        MiJardin j = new MiJardin("turqueza");
        j.solicitarVisita();
        j.observar();
        j.finalizarVisita();
    }
}
