package cr.tec.poo.ejemplos.tiposgenericos;

// Clase abstracta que define el comportamiento y los atributos de un Animal

public abstract class Animal {
	
	protected String nombre; 
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public abstract void comer();

	public String getNombre() {
		return nombre;
	}
	
	

}
