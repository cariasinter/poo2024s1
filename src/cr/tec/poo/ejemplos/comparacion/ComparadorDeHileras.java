package cr.tec.poo.ejemplos.comparacion;

public class ComparadorDeHileras {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String nombre1 = "Luis";
        String nombre2 = "Paco";
        String nombre3 = "Hugo";

        // En Java las hileras son inmutables, por esta razón la máquina virtual optimiza
        // su creación reutilizando las hileras ya creadas. En este caso, en lugar de
        // crear un nuevo objeto con los contenidos "Luis", la variable nombre4
        // va a referenciar el mismo objeto al que referencia nombre1
        String nombre4 = "Luis";

        if (nombre1 == nombre2) {
            System.out.println("nombre1 == nombre2");
        }
        if (nombre2.equals(nombre1)) {
            System.out.println("nombre2 equals nombre1");
        }
        if (nombre1.equals(nombre4)) {
            System.out.println("nombre1 equals nombre4");
        }
        if (nombre1 == nombre4) {
            System.out.println("nombre1 == nombre4");
        }





    }

}