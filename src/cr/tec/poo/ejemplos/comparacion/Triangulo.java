package cr.tec.poo.ejemplos.comparacion;

public class Triangulo extends FiguraGeometrica {
	// Propiedades especificas de la clase Triangulo: base y altura
	private int base, altura;
	
	public Triangulo() {
		this(10,5);		
	}
	
	public Triangulo(int base, int altura) {
		// Reutilizar la otra version del constructor...
		this("blanco", "azul", base, altura);
	}
	
	public Triangulo(String colorLinea, String colorRelleno,
					int base, int altura) {
		// Reutilizar el constructor definido en la clase padre...
		super(colorLinea, colorRelleno);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null) {
			return false;
		}

		if (!(arg0 instanceof Triangulo)) {
			return false;
		}
		
		// Implementacion de la logica de comparacion de objetos:
		// Se determina que dos triangulos son iguales si tienen la 
		// misma base y altura
		return (this.getBase() == ((Triangulo) arg0).getBase()
				&& this.getAltura() == ((Triangulo) arg0).getAltura());
		
	}
	
	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(5, 4);
		Triangulo t2 = new Triangulo(5, 4);
		if (t1.equals(t2)) {
			System.out.println("Son iguales!");
		}
		else {
			System.out.println("Son diferentes!");
		}
	}

}
