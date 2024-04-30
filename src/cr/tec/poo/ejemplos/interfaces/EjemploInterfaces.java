package cr.tec.poo.ejemplos.interfaces;

// Define el tipo AnimalTerrestre en términos de todos
// los métodos asociados a este tipo
interface AnimalTerrestre {
    void caminar();
}

interface AnimalVolador {
    void volar();
}

// Al implementar la interfaz AnimalTerrestre, la clase se compromete
// a proveer una implementación para los métodos de dicha Interfaz
class Persona implements AnimalTerrestre {

    public void saludar() {
        System.out.println("Hola, soy una persona");
    }

    public void caminar() {
        System.out.println("Una persona caminando...");
    }
}

class Mujer extends Persona {

    public void maquillarse() {
        System.out.println("Mujer maquillándose");
    }
}


// Esta clase se compromete a implementar tanto los métodos de la
// interfaz AnimalTerrestre como los de la interfaz AnimalVolador
class GatoVolador implements AnimalTerrestre, AnimalVolador {

    public void caminar() {
        System.out.println("El gato volador caminando...");
    }

    public void volar() {
        System.out.println("El gato volador volando...");
    }

}

public class EjemploInterfaces {

    public void metodoTerrestre(AnimalTerrestre at ) {
        System.out.println("Poniendo a caminar al animal terrestre...");
        at.caminar();
    }

    public void metodoAereo(AnimalVolador av) {
        System.out.println("Poniendo a volar al animal terrestre...");
        av.volar();
    }

    public void introducirPersona(Persona p) {
        System.out.println("Introduciendo a una persona..");
        if (p instanceof Mujer) {
            // Conversión de tipos hacia abajo en la jerarquía: downcasting
            // Se convierte la referencia de tipo Persona a una referencia
            // de tipo Mujer para poder invocar sobre ella un método definido
            // en la clase Mujer.
            // Esta conversión se hace de forma explícita
            ((Mujer) p).maquillarse();
        }
        p.saludar();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        EjemploInterfaces ejemplo = new EjemploInterfaces();
        Persona p = new Persona();
        GatoVolador elGatoVolador = new GatoVolador();
        Mujer m = new Mujer();

        ejemplo.metodoTerrestre(p);
        ejemplo.metodoTerrestre(m);
        ejemplo.metodoTerrestre(elGatoVolador);
        ejemplo.metodoAereo(elGatoVolador);

        ejemplo.introducirPersona(p);
        // Ejemplo de conversión de tipos hacia arriba en la jerarquía: upcasting
        // introducirPersona() requiere una entidad de tipo Persona, sin embargo
        // le pasamos una entidad de tipo Mujer. Como el tipo Mujer es compatible con
        // Persona (por ser una subclase), la invocación es válida y se realiza una
        // conversión implícita de Mujer a Persona
        ejemplo.introducirPersona(m);


    }

}
