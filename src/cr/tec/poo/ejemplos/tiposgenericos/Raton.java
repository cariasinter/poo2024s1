package cr.tec.poo.ejemplos.tiposgenericos;

public class Raton extends Animal {
	
	public Raton(String nombre) {
		super(nombre);
	}

	@Override
	public void comer() {
		System.out.println("Un ratón (" + nombre + ") está comiendo...");
	}

}
