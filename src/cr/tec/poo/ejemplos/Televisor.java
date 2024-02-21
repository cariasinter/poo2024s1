package cr.tec.poo.ejemplos;

public class Televisor {

    int canalActual;
    int volumenActual;
    boolean encendido;

    public Televisor() {
        canalActual = 7;
        volumenActual = 10;
        encendido = false;
    };

    void encender() {
        encendido = true;
    };

    void apagar() {
        encendido = false;
    };

    void cambiarEstadoEncendido() {
        encendido = !encendido;
    };

    void subirVolumen() {
        if (volumenActual < 10)
            volumenActual++;
    }

    void bajarVolumen() {
        if (volumenActual > 0)
            volumenActual--;
    }

    void irACanal(int canal) {
        if (canal > 0 && canal < 101) {
            this.canalActual = canal;
        }
    }

    void siguienteCanal() {
        irACanal(canalActual + 1);
    }

    void anteriorCanal() {
        irACanal(canalActual - 1);
    }

    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor();
        Televisor tv3 = tv1;

        tv1.encender();
        tv1.irACanal(1);
        System.out.println(tv1.canalActual);
        tv3.siguienteCanal();
        System.out.println(tv1.canalActual);

        Televisor tv4 = null;

        // Null Pointer Exception!!
        System.out.println(tv4.canalActual);

        tv2 = tv1;

    }



}
