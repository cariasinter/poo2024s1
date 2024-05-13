package cr.tec.poo.ejemplos.excepciones;

class DimensionInvalida extends  Exception {
    public DimensionInvalida(String msg) {
        super(msg);
    }

}
public class RectanguloRobusto {
    int largo;
    int ancho;

    public RectanguloRobusto(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int calcularPerimetro() throws DimensionInvalida {
        if (largo < 1 || ancho < 1) {
            throw new DimensionInvalida("Dimensiones invalidos, largo %s, ancho %s"
                    .formatted(largo, ancho));
        };

        return  2 * largo + 2 * ancho;
    }

    public int calcularProporcionalidad() throws DimensionInvalida{
        if (largo < 1 || ancho < 1) {
            throw new DimensionInvalida("Dimensiones invalidos, largo %s, ancho %s"
                    .formatted(largo, ancho));
        };
        return largo / ancho;
    }

    public static void main(String[] args) {
        RectanguloRobusto r = new RectanguloRobusto(3, 0);
        try {
            // abrir archivo
            int proporcion = r.calcularProporcionalidad();
            System.out.println("Proporcion es %s".formatted(proporcion));
        } catch (DimensionInvalida di) {
            System.out.println("Detectamos un problema " + di.getMessage());
        } finally {
            // cerrar archivo
            System.out.println("Listo ya cerré el archivo");
        }



    }
}
