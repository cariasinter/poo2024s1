package cr.tec.poo.ejemplos.herencia;

public class Cuadrado extends Rectangulo {

    private int lado;

    public Cuadrado(int lado) {
        super(lado, lado);
        System.out.println("Cuadrado.constructor");
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de lado %s"
                .formatted(lado));
    }
}
