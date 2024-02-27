package cr.tec.poo.ejemplos;

public class Televisor {

    private static int numeroTelevisores = 0;

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
        canalActual = 7;
        volumenActual = 10;
        encendido = false;
        numeroTelevisores++;
    };

    public void encender() {
        encendido = true;
        sintonizar();
    };

    public void apagar() {
        encendido = false;
    };

    public void subirVolumen() {
        if (volumenActual < 10)
            volumenActual++;
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
        System.out.println("Sintonizando el canal " + canalActual);
        System.out.println("..." );
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
        this.canalActual = 5;
        return "Televisor{" +
                "canalActual=" + canalActual +
                ", volumenActual=" + volumenActual +
                ", encendido=" + encendido +
                '}';
    }

    public static void main(String[] args) {
        this.canalActual = 5;
        System.out.println(Televisor.numeroTelevisores);
        int canalActual = (new Televisor()).canalActual;




        System.out.println(canalActual);
        Televisor tv = new Televisor();
        System.out.println(Televisor.numeroTelevisores);

        Televisor.imprimirInformacion();

    }

}
