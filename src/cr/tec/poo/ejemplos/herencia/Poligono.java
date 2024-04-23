package cr.tec.poo.ejemplos.herencia;

public class Poligono {

    private int numeroVertices;

    public Poligono(int numeroVertices) {
        System.out.println("Poligono.constructor");
        this.numeroVertices = numeroVertices;
    }

    /* public Poligono() {
        System.out.println("Poligono.constructor");
        this.numeroVertices = 4;
    } */

    public void dibujar() {
        System.out.println("Dibujando poligono de %s vertices"
                .formatted(numeroVertices));

    }
}
