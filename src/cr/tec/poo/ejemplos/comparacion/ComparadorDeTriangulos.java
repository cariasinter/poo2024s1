package cr.tec.poo.ejemplos.comparacion;

public class ComparadorDeTriangulos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Prueba de:
		// - comparaci�n de referencias (==)
		// - comparaci�n de objetos
		Triangulo t1 = new Triangulo(10,2);
		Triangulo t2 = new Triangulo(10,2);
		Triangulo t3 = t1;
		Triangulo t4 = new Triangulo(10,3);
		// Rectangulo r = new Rectangulo(10, 2); ClassCastException!
		
		if (t1 == t3) {
			System.out.println("t1 t3 iguales");
		}
		
		if (t1.equals(t3)) {
			System.out.println("t1 t3 equals");
		}
		
		
		if (t1 == t2) {
			System.out.println("t1 t2 iguales");
		}
		
		if (t1.equals(t2)) {
			System.out.println("t1 t2 equals");
		}

		if (t1.equals(t4)) {
			System.out.println("t1 t4 equals");
		}
		
		/*if (t1.equals(r)) {
			System.out.println("t1 r equals");
		}*/
	}

}


