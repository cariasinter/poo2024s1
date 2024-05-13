package cr.tec.poo.ejemplos.tiposgenericos;

public class Perro extends Animal {
	
	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void comer() {
		System.out.println("Un perro (" + nombre + ") está comiendo...");
	}

}
