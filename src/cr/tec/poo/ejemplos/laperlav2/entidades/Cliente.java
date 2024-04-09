package cr.tec.poo.ejemplos.laperlav2.entidades;

public class Cliente {
    private String identificador;

    private String nombre;

    public Cliente(String identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }
}
