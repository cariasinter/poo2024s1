package cr.tec.poo.ejemplos.polimorfismo;

class Guitarra extends Instrumento {

    // La clase Guitarra agrega un atributo adicional y lo toma en cuenta en el constructor
    private int numeroCuerdas;

    public Guitarra(String nombre, String marca, int numeroCuerdas) {
        super(nombre, marca);
        this.numeroCuerdas = numeroCuerdas;
    }

    @Override
    public void sonar() {
        System.out.println("Guitarra: TA TA TAAAN!");
    }

}