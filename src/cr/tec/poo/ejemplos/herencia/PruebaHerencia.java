package cr.tec.poo.ejemplos.herencia;

import java.util.List;

public class PruebaHerencia {

    public static void dibujarPoligono(Poligono p) {
        p.dibujar(); // Jump a Poligono, linea 17
    }



    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(10,2);
        r.dibujar();

        // OK
        Poligono c = new Cuadrado(4);
        dibujarPoligono(c);

        // No OK
        // Cuadrado c2 = new Rectangulo(3,3);

        // No OK: List es una clase abstracta
        // List l = new List();

        Poligono p = new Rectangulo(5,3);
        System.out.println(p);
        p.dibujar();
        p = new Cuadrado(3);
        p.dibujar();

        // Validación de tipos: (tipado estático)
        // Se realiza en tiempo de compilación
        // Por esa validación, los siguientes - No OK
        // int altura = p.getAltura();
        // p.calcularDiagonal();
    }

    /*
     */
}
