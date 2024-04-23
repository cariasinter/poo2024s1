package cr.tec.poo.ejemplos.polimorfismo;

import java.util.Random;

public class EjemploPolimorfismo {


    public static void main(String args[]) {
        probarPolimorfismoSimple();
        //probarColeccionesPolimorficas();
    }



    public static void probarPolimorfismoSimple() {
        Instrumento i = new Saxofon("kenny", "yamaha");
        i.sonar();
        i = new GuitarraElectrica("dulcinea", "bender", 6, 220);
        i.sonar();

        /*
        // Otro ejemplo - parcial.
        // Dada una clase padre: Departamento
        // Y clases hijas: Admnistracion, Academia y ServiciosEstudiantiles

        // p es una entidad polimórfica
        Departamento p;
        // Costo de la universidad = administracion + academia + proyeccion
        int costoTotal = 0;
        // obtenerAdministracion() es un 'factory method' que devuelve una referencia a un objeto de tipo
        // administracion y aisla al cliente de los detalles internos sobre cómo se obtiene dicha referencia
        p = obtenerAdmistracion();
        costoTotal += p.calcularCosto();
        // obtenerAcademia() es otro factory method
        p = obtenerAcademia();
        costoTotal += p.calcularCosto();
        // obtenerServiciosEstudiantiles() es otro factory method
        p = obtenerServiciosEstudiantiles();
        costoTotal += p.calcularCosto();
         */
    }

    public static void probarColeccionesPolimorficas() {

        Instrumento[] orquesta = new Instrumento[8];
        // Crear la orquesta aleatoriamente
        for (int i = 0; i < 8; i++) {
            Instrumento instActual = null;
            int numeroAleatorio = (new Random()).nextInt(4);
            switch (numeroAleatorio) {
                case 0:
                    instActual = new Saxofon("Maggie", "Yamaha");
                    break;
                case 1:
                    // Guitarra de 6 cuerdas
                    instActual = new Guitarra("Jose", "Palmer", 6);
                    break;
                case 2:
                    // Guitarra eléctrica de 6 cuerdas y 1000 voltios
                    instActual = new GuitarraElectrica("Slash", "Blender", 6, 1000);
                    break;
                case 3:
                    instActual = new Piano("Bambo", "Yamaha");
                    break;
            }
            orquesta[i] = instActual;
        }
        // Poner a sonar la orquesta
        for (int i = 0; i < 8; i++) {
            // La variable instActual es polimórfica: va a referenciar diferentes objetos,
            // de diferentes clases concretas (todas subclases de Instrumento),
            // en diferentes momentos
            Instrumento instActual = orquesta[i];
            // El ligado o "jump" que determina cuál código se va a ejecutar cuando se
            // invoca sonar es dinámico: solo se puede determinar en tiempo de ejecución,
            // dependiendo de la clase específica del objeto al que referencia en ese momento
            // instActual
            instActual.sonar();
        }
    }

}