package cr.tec.poo.ejemplos;

public class Aplicacion  {

    public static void main(String[] args) {


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
}
