package cr.tec.poo.ejemplos.tiposgenericos;

/*
 * Contenedor sencillo para dos objetos que deseamos mantener emparejados
 * La idea es que esta clase sea de propósito general, por lo que hablamos de una pareja de objetos,
 * no específicamente de  "parejas de animales" o "parejas de patos"
 * 
 * Sin embargo esta clase posee dos desventajas con respecto al uso de tipos genéricos
 * 1- Le impide al compilador verificar los tipos de los objetos contenidos. Eso significa que 
 * se puede, por error, tener parejas de "un perro y un string" o "un pato y un ratón",
 * y el error que esto supondría solo se podría detectar en tiempo de ejecución, disparándose
 * una excepción.
 * 2- Como los métodos de lectura tienen que devolver un valor del tipo (Object), 
 * es necesario hacer "downcasting" a los objetos devueltos con el fin de poder manipularlos
 * según su tipo original. Esto implica mayor "verbosidad" del código
 * 
 */
public class Pareja {
	
	private Object objeto1;
	private Object objeto2;
	
	public Pareja(Object objeto1, Object objeto2) {
		this.objeto1 = objeto1;
		this.objeto2 = objeto2;
	}

	public Object getObjeto1() {
		return objeto1;
	}

	public Object getObjeto2() {
		return objeto2;
	}

}
