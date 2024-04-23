package cr.tec.poo.ejemplos.polimorfismo;

// Clase base de la herencia
class Instrumento {

    String nombre;
    String nombreMarca;

    public Instrumento(String nombre, String nombreMarca) {
        this.nombre = nombre;
        this.nombreMarca = nombreMarca;
    }

    public void sonar() {
        System.out.println("Un instrumento sonando");
    }

}