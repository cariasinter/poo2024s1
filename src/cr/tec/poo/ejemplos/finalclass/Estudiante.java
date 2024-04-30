package cr.tec.poo.ejemplos.finalclass;

/**
 * Ejemplo de clase final
 *
 */
public final class Estudiante {

    public void saludar() {
        System.out.println("Hola" );
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        // El compilador puede hacer ligado estático de la siguiente instrucción
        // debido a que no puede existir ninguna subclase de Estudiante que
        // redefina el método saludar()
        e.saludar();
    }

}
