package cr.tec.poo.ejemplos.tiposgenericos;

public class Pato extends Animal {
	
	public Pato(String nombre) {
		super(nombre);
	}

	@Override
	public void comer() {
		System.out.println("Un pato (" + nombre + ") está comiendo...");
	}

}