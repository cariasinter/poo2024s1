package cr.tec.poo.ejemplos.laperlav2.entidades;

public class Producto {

    private String codigoProducto;

    private float precioUnitario;

    private String descripcion;

    public Producto(String codigoProducto, float precioUnitario, String descripcion) {
        this.codigoProducto = codigoProducto;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
