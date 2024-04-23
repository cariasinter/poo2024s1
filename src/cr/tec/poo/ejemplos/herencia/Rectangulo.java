package cr.tec.poo.ejemplos.herencia;

public class Rectangulo extends  Poligono {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        super(4);
        System.out.println("Rectangulo.constructor");
        this.base = base;
        this.altura = altura;
    }

    public int calcularDiagonal() {
        return base + altura / 2; // La matematica no es lo mio
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo de altura %s"
                .formatted(getAltura()));
    }
}
