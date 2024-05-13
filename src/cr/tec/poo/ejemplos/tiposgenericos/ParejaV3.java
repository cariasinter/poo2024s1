package cr.tec.poo.ejemplos.tiposgenericos;

/*
 * Contenedor sencillo para dos objetos que deseamos mantener emparejados
 * Al utilizar tipos genéricos, garantiza que los dos miembros sean del mismo
 * tipo específico y que dicho tipo sea un subtipo de Animal
 */

class ContenedorDobleV1<Tipo> {
	private Tipo objetoContenido1;
	private Tipo objetoContenido2;

	public ContenedorDobleV1(Tipo o1, Tipo o2) {
		objetoContenido1 = o1;
		objetoContenido2 = o2;
	}

	public static void main(String[] args) {
		ContenedorDobleV1 miContenedor
				= new ContenedorDobleV1<>(new Raton("Mickey"),
									   new Pato("Lopez"));

	}
}

public class ParejaV3<T extends  Animal> {
	
	private T macho;
	private T hembra;
	
	public ParejaV3(T macho, T hembra) {
		this.macho = macho;
		this.hembra = hembra;
	}

	public T getMacho() {
		return macho;
	}

	public T getHembra() {
		return hembra;
	}
	
	public void comer() {
		hembra.comer();
		macho.comer();
	}
	

}
