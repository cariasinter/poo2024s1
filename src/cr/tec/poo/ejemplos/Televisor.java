package cr.tec.poo.ejemplos;

import java.util.Arrays;
import java.util.List;

public class Televisor {

    private static int numeroTelevisores;

    private int canalActual;
    private int volumenActual;
    private boolean encendido;

    public int getCanalActual() {
        return canalActual;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public Televisor() {
        this(7);
    };

    public Televisor(int canalInicial) {
        this(canalInicial, 10);
    }

    public Televisor(int canalInicial, int volumenInicial) {
        canalActual = canalInicial;
        volumenActual = volumenInicial;
        encendido = false;
        numeroTelevisores++;
    }


    public void encender() {
        encendido = true;
        sintonizar();
    };

    public void apagar() {
        encendido = false;
    };

    public void subirVolumen() {
        subirVolumen(1);
    }

    public void subirVolumen(int paso) {
        if (volumenActual + paso < 100) {
            volumenActual += paso;
        }
    }

    public void bajarVolumen() {
        if (volumenActual > 0)
            volumenActual--;
    }

    public void irACanal(int canal) {
        if (canal > 0 && canal < 101) {
            this.canalActual = canal;
            sintonizar();
        }
    }

    private void sintonizar() {
        List fuentes = Arrays.asList("Antena-Analogica", "Antena-Digital", "Cable");

        System.out.println("Sintonizando el canal " + canalActual);
        fuentes.forEach((i) -> System.out.println("Probando en..."  + i) );
        System.out.println("sintonizado!" );
    }

    public void siguienteCanal() {
        irACanal(canalActual + 1);
    }

    public void anteriorCanal() {
        irACanal(canalActual - 1);
    }

    public static void imprimirInformacion() {
        System.out.println(numeroTelevisores + " tvs creados");
        // System.out.println(getCanalActual()); Error!!

    }

    @Override
    public String toString() {
        return "Televisor{" +
                "canalActual=" + canalActual +
                ", volumenActual=" + volumenActual +
                ", encendido=" + encendido +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Televisor.numeroTelevisores);
        int canalActual = (new Televisor()).canalActual;




        System.out.println(canalActual);
        Televisor tv = new Televisor();
        System.out.println(Televisor.numeroTelevisores);

        Televisor.imprimirInformacion();

    }

}
