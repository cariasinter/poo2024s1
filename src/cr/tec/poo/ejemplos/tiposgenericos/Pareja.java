package cr.tec.poo.ejemplos.tiposgenericos;

/*
 * Contenedor sencillo para dos objetos que deseamos mantener emparejados
 * La idea es que esta clase sea de prop�sito general, por lo que hablamos de una pareja de objetos,
 * no espec�ficamente de  "parejas de animales" o "parejas de patos"
 * 
 * Sin embargo esta clase posee dos desventajas con respecto al uso de tipos gen�ricos
 * 1- Le impide al compilador verificar los tipos de los objetos contenidos. Eso significa que 
 * se puede, por error, tener parejas de "un perro y un string" o "un pato y un rat�n",
 * y el error que esto supondr�a solo se podr�a detectar en tiempo de ejecuci�n, dispar�ndose
 * una excepci�n.
 * 2- Como los m�todos de lectura tienen que devolver un valor del tipo (Object), 
 * es necesario hacer "downcasting" a los objetos devueltos con el fin de poder manipularlos
 * seg�n su tipo original. Esto implica mayor "verbosidad" del c�digo
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
