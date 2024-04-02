package cr.tec.poo.ejemplos.laperlav1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Factura {
	
	private String numero;
	private String cliente;
	Date fecha;
	
	private List<Linea> detalleFactura;

	public Factura(String numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
		detalleFactura = new ArrayList<Linea>();	
		// Fecha inicializada a hoy
		fecha = new Date();
		
	}
	
	public void agregarLinea(int cantidad, String codigo, 
			                 String descripcion, double precio) {
		detalleFactura.add(new Linea(cantidad, codigo, descripcion, precio));
	}
	
	public double calcularSubTotal() {
		double resultado = 0;
		for (Linea l : detalleFactura) {
			resultado = resultado + l.calcularCosto();
		}
		return resultado;
	}
	
	public double calcularImpuesto() {
		return calcularSubTotal() * 13/100;
	}
	
	public double calcularTotal() {
		return calcularSubTotal() + calcularImpuesto();
	}
	
	
	public static void main(String[] args) {
		Factura f = new Factura("001", "Juan Perez");
		f.agregarLinea(2, "M1", "Martillo", 1750);
		f.agregarLinea(3, "S2", "Serrucho", 2230);
		
		System.out.println("Subtotal: " + f.calcularSubTotal());
		System.out.println("Impuesto: " + f.calcularImpuesto());
		System.out.println("Total: " + f.calcularTotal());
		

	}

}
