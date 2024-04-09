package cr.tec.poo.ejemplos.laperlav2.entidades;

import cr.tec.poo.ejemplos.laperlav2.utilitarios.AdministradorDeImpresion;
import cr.tec.poo.ejemplos.laperlav2.utilitarios.BaseDeDatos;
import cr.tec.poo.ejemplos.laperlav2.utilitarios.Configuracion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
   private static int numeroFacturaActual = -1;
   private static Configuracion config = new Configuracion();
   private  static BaseDeDatos bd = new BaseDeDatos();


    private Date fecha;
    private int numeroFactura;
    private Cliente cliente;
    private float porcentajeIVA;

    private List<LineaFactura> lineas;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        if (numeroFacturaActual < 0) {
            numeroFacturaActual = config.getNumeroInicialDeFactura();
        }
        this.numeroFactura = numeroFacturaActual++;
        config.actualizarNumeroActualDeFactura(numeroFacturaActual);
        lineas = new ArrayList<>();
        fecha = new Date();
        porcentajeIVA = config.getPorcentajeIVA();
    }

    public void agregarLinea(int cantidad, Producto producto) {
        lineas.add(new LineaFactura(lineas.size()+1, cantidad,
                producto));
    }

    private float sumaDeLineas(){
        return  lineas.stream()
                .map(l -> l.precioTotal())
                .reduce(0f, (a, b) -> a + b);

    }

    public float precioAntesDelIVA() {
        return sumaDeLineas();
    }

    public float montoIVA() {
        return sumaDeLineas() * porcentajeIVA;
    }

    public float precioTotal() {
        var resultado = sumaDeLineas();
        resultado += resultado * porcentajeIVA;
        return  resultado;
    }

    public void guardarEnBaseDeDatos() {
        bd.guardarFactura(this);
    }

    private String truncar(String s, int tamanoMaximo) {
        if (s.length() <= tamanoMaximo) {
            return s;
        } else {
            return s.substring(0, tamanoMaximo);
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha: %tD%n".formatted(fecha))
                .append("Factura # %d%n".formatted(numeroFactura))
                .append("Cliente: %s%n".formatted(cliente.getNombre()));
        sb.append("|#  |Cantidad |Descripción                   |Subtotal  |%n".formatted());
        for (LineaFactura l : lineas) {
            sb.append("|%3d|%9d|%30s|%10.02f|%n".formatted(
                    l.getNumeroDeLinea(),
                    l.getCantidad(),
                    truncar(l.getProducto().getDescripcion(), 30),
                    l.precioTotal()));
        }
        sb.append("Subtotal: %.02f%n".formatted(precioAntesDelIVA()))
                .append("IVA: %.02f%n".formatted(montoIVA()))
                .append("Total: %.02f%n%n".formatted(precioTotal()));
        return sb.toString();
    }

    public void imprimir() {
        AdministradorDeImpresion impresion = new AdministradorDeImpresion();
        impresion.imprimir(toString());
    }

    public Date getFecha() {
        return fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public float getPorcentajeIVA() {
        return porcentajeIVA;
    }



}
