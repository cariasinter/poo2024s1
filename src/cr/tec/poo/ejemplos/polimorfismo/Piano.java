package cr.tec.poo.ejemplos.polimorfismo;

class Piano extends Instrumento {

    public Piano(String nombre, String marca) {
        super(nombre, marca);
    }

    public void sonar() {
        System.out.println("Piano: PLAN, PLA PLAN");
    }



}