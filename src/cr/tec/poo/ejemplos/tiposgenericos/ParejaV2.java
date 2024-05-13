package cr.tec.poo.ejemplos.tiposgenericos;

/*
 * Contenedor sencillo para dos objetos que deseamos mantener emparejados
 * Esta versi�n Animal como el tipo de los objetos, lo cual permite invocar 
 * directamente m�todos tales como comer().
 * Sin embargo, esta implementaci�n no evita que se puedan mezclar objetos de
 * diferente tipo espec�fico en una misma pareja, es decir, que se puedan
 * mezclar animales entre s�
 */

public class ParejaV2 {
	
	private Animal macho;
	private Animal hembra;
	
	public ParejaV2(Animal macho, Animal hembra) {
		this.macho = macho;
		this.hembra = hembra;
	}

	public Animal getMacho() {
		return macho;
	}

	public Animal getHembra() {
		return hembra;
	}
	
	public void comer() {
		hembra.comer();
		macho.comer();
	}
	

}
