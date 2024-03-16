package cr.tec.poo.ejemplos;

public class Aplicacion  {

    public static void prueba1() {
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor()      ;
        Televisor tv3 = tv1;

        tv1.encender();
        System.out.println("tv1.canalActual: " + tv1.getCanalActual());
        tv1.irACanal(1);
        System.out.println("tv1.canalActual: " + tv1.getCanalActual());
        tv3.siguienteCanal();
        System.out.println("tv1.canalActual: " + tv1.getCanalActual());

        Televisor tv4 = null;

        // Null Pointer Exception!!
        // System.out.println(tv4.canalActual);
        System.out.println("tv2: " + tv2);
        tv2 = tv1;

        System.out.println("tv1: " + tv1);
        System.out.println("tv2: " + tv2);
        System.out.println("tv3: " + tv3);
        System.out.println("tv4: " + tv4);
    }

    public static void probarClonado() {
        Televisor tv1 = new Televisor();
        tv1.irACanal(8);

        Televisor tv2 = tv1;

        Televisor tv3 = null;

        try {
            tv3 = (Televisor) tv1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("No se pudo clonar");
            e.printStackTrace();
        }

        if (tv3 != null ) {
            tv2.irACanal(10);
            System.out.println("Canal actual de tv1 " + tv1.getCanalActual());
            System.out.println("Canal actual de tv3 " + tv3.getCanalActual());
        }

    }

    public static void main(String[] args) {
        probarClonado();
    }
}
