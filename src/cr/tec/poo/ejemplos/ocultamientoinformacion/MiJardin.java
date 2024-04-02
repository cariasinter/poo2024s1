package cr.tec.poo.ejemplos.ocultamientoinformacion;

public class MiJardin {

    // Atributos privados para forzar el ocultamiento
    // de información
    private int cantidadFlores;
    private String colorFlores;
    private boolean enVisita;

    public MiJardin(String colorFlores) {
        this.colorFlores = colorFlores;
        enVisita = false;
        mantenimientoDiario();
    }

    // Los siguientes 3 métodos son parte de la implementación
    // de la clase y están ocultos al cliente externo

    private void abonar() {
        cantidadFlores++;
    }

    private void anegar() {
        colorFlores = colorFlores  + " brillante";
    }

    private void mantenimientoDiario() {
        anegar();
        abonar();
    }

    // Los siguientes métodos son públicos, es decir,
    // forman parte de la interfaz de la clase
    public boolean solicitarVisita() {
        if (! enVisita) {
            enVisita = true;
            return true;
        }
        else {
            return false;
        }
    }

    public void observar() {
        if (enVisita) {
            System.out.println("Tenemos " + cantidadFlores +
                    " bellas flores de color " + colorFlores);
        }
        else {
            System.out.println("Debe solicitar la visita primero");
        }
    }

    public void finalizarVisita() {
        enVisita = false;
    }

}