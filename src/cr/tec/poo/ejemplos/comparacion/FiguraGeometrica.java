package cr.tec.poo.ejemplos.comparacion;

// Clase base para una figura geometrica. 
// Define un par de propiedades para una figura geometrica.
// Las subclases pueden agregar propiedades adicionales

public class FiguraGeometrica {
	private String colorLinea;
	private String colorRelleno;
		
	public FiguraGeometrica(String colorLinea, String colorRelleno) {
		// Inicializar variables de instancia
		this.colorLinea = colorLinea;
		this.colorRelleno = colorRelleno;
	}


	public String getColorLinea() {
		return colorLinea;
	}


	public void setColorLinea(String colorLinea) {
		this.colorLinea = colorLinea;
	}


	public String getColorRelleno() {
		return colorRelleno;
	}


	public void setColorRelleno(String colorRelleno) {
		this.colorRelleno = colorRelleno;
	}
	
	public static void main() {
		FiguraGeometrica f1 = new FiguraGeometrica("azul", "rojo");
		// FiguraGeometrica f2 = new FiguraGeometrica();
	}

}
