package cr.tec.poo.ejemplos.excepciones;

// Esta subclase de Exception se utiliza para forzar que el cliente de la calculadora
// tenga que proveer una manera de tratar con estas excepciones
class NumeroMuyGrandeException extends Exception {
	
	public NumeroMuyGrandeException(String msg) {
		super(msg);
	}
	
}

class Calculadora {
	
	// Se declara de forma explícita que este método puede disparar excepciones
	// con las que hay que tratar
	public int dividirEnteros(int x, int y)  
			throws NumeroMuyGrandeException {
		if ((x > 100) || (y > 100) ) {
			// Caso excepcional
			throw new NumeroMuyGrandeException("Numeros muy grandes!");
		}
			
		// caso normal
		return x / y;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora c = new Calculadora();		
		System.out.println("Inicio de pruebas");
		
		try {
			System.out.println("Abriendo archivo...");
			int resultado = c.dividirEnteros(50, 2);
			System.out.println("El resultado de la división es: " + resultado);
		}
		catch (NumeroMuyGrandeException nmge) {
			System.out.println("Que pena, no podemos manejar numeros grandes");			
		}
		
		finally {
			// El bloque finally se invoca siempre
			System.out.println("Cerrando el archivo");
		}
		
		System.out.println("Fin de pruebas");
	}

		
}