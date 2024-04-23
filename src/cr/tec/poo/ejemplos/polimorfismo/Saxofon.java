package cr.tec.poo.ejemplos.polimorfismo;

class Saxofon extends Instrumento {

    // Dado que en la clase Padre el constructor por defecto (sin parámetros)
    // está descartado, se debe proveer un constructor explícito en la clase hija.
    // Si este constructor no realiza nada adicional, se puede simplemente
    // reutilizar el constructor de la clase padre por medio de la palabra super(...)
    public Saxofon(String nombre, String marca) {
        super(nombre, marca);
    }

    // Redefinición del método sonar()
    @Override
    public void sonar() {
        System.out.println("Saxofon: TRTRTRTRRAAAA!");
    }

}
