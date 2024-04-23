package cr.tec.poo.ejemplos.polimorfismo;

class GuitarraElectrica extends Guitarra {

    // La clase GuitarraElectrica agrega un atributo adicional y lo toma en cuenta en el constructor
    int voltaje;

    public GuitarraElectrica(String nombre, String marca, int numeroCuerdas, int voltaje) {
        super(nombre, marca, numeroCuerdas);
        this.voltaje = voltaje;
    }

    public void sonar() {
        System.out.println("Guitarra Electrica: NIIIIIIIEEEE OH YEAH!");
    }

}