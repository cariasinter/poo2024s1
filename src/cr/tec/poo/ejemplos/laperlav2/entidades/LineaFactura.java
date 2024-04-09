package cr.tec.poo.ejemplos.laperlav2.entidades;

public class LineaFactura {

    private int numeroDeLinea;
    private int cantidad;
    private float precioUnitario;

    private Producto producto;

    public LineaFactura(int numeroDeLinea, int cantidad, Producto producto) {
        this.numeroDeLinea = numeroDeLinea;
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUnitario = producto.getPrecioUnitario();
    }

    public int getNumeroDeLinea() {
        return numeroDeLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public float precioTotal() {
        return cantidad * precioUnitario;
    }

}
