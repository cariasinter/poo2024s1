package cr.tec.poo.ejemplos.variables;

// Ejemplo de variables de instancia versus variables de clase versus variables locales
public class ReproductorDeMusica {

    // Variables a nivel de clase y que no se pueden modificar,
    // cumplen la función de ser "constantes"
    public static final int VOLUMEN_MAXIMO = 10;

    public static final int VOLUMEN_MINIMO = 0;
    public static final int VOLUMEN_POR_DEFECTO = 6;

    // Variable a nivel de clase, contador de reproducciones total
    // Existe una sola vez, a nivel de la clase
    public static int cantidadTotalDeReproducciones = 0;

    // Variables de instancia, existen para cada objeto que se
    // instancie de esta clase
    private int volumen = VOLUMEN_POR_DEFECTO;
    private boolean efectoEnvolvente = false;
    private String cancionActual = null;
    private int contadorDeReproducciones = 0;

    public void incrementarVolumen() {
        if (volumen < VOLUMEN_MAXIMO) volumen++;
    }

    public void decrementarVolumen() {
        if (volumen > VOLUMEN_MINIMO) volumen--;
    }

    public void incrementarVolumenMultiple(int veces) {
        // i es una variable local
        int i = 0;
        while (i < veces) {
            incrementarVolumen();
            i++;
        }
    }

    public void reproducirCancion(String cancion) {
        cancionActual = cancion;
        // Actualizar el contador de reproducciones para esta instancia
        contadorDeReproducciones++;
        // Actualizar el contador de reproducciones compartido por todas las instancias
        cantidadTotalDeReproducciones++;
    }

    public void detenerReproduccion() {
        cancionActual = null;
    }

    // Métodos de escritura y lectura de los atributos

    public int getVolumen() {
        return volumen;
    }

    public void setEfectoEnvolvente(boolean efectoEnvolvente) {
        this.efectoEnvolvente = efectoEnvolvente;
    }

    public boolean getEfectoEnvolvente() {
        return efectoEnvolvente;
    }

    public String getCancionActual() {
        return cancionActual;
    }

    public int getContadorReproducciones() {
        return contadorDeReproducciones;
    }

    public static void main(String[] args) {
        // El método main es estático, existe a nivel de la clase.
        // Por esta razón este método no puede accesar variables de instancia,
        // la siguiente instrucción sería inválida
        // System.out.println(contadorDeReproducciones);
        // Sin embargo la siguiente instrucción sí es válida, ya que se accesa una variable estática
        System.out.println(cantidadTotalDeReproducciones);

        ReproductorDeMusica r1 = new ReproductorDeMusica();
        r1.incrementarVolumenMultiple(10);
        r1.setEfectoEnvolvente(true);
        r1.reproducirCancion("La Gasolina");
        System.out.println("Volumen de la instancia referenciada por r1: " + r1.getVolumen());
        System.out.println("Canción actual de la instancia referenciada por r1: " + r1.getCancionActual());
        r1.detenerReproduccion();
        System.out.println("Canción actual de la instancia referenciada por r1: " + r1.getCancionActual());
        System.out.println("Contador de reproducciones de la instancia referenciada por r1: " + r1.getContadorReproducciones());

        ReproductorDeMusica r2 = new ReproductorDeMusica();
        r2.reproducirCancion("9na de Beethoven");
        System.out.println("Volumen de la instancia referenciada por r2: " + r2.getVolumen());
        System.out.println("Canción actual de la instancia referenciada por r2: " + r2.getCancionActual());
        r2.detenerReproduccion();
        System.out.println("Canción actual de la instancia referenciada por r2: " + r2.getCancionActual());
        System.out.println("Contador de reproducciones de la instancia referenciada por r2: " + r2.getContadorReproducciones());

        System.out.println("Cantidad total de reproducciones: " + ReproductorDeMusica.cantidadTotalDeReproducciones);

    }

}