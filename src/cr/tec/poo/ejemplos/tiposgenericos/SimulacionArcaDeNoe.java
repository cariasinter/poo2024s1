package cr.tec.poo.ejemplos.tiposgenericos;

public class SimulacionArcaDeNoe {
	

	public void ejecutarV1() {
		// El arreglo arca contiene las parejas de animales (arreglo de 3 parejas) 
		Pareja[] arca = new Pareja[3];
		arca[0] = new Pareja(
					new Pato("Donald"),
					new Pato("Daisy")
				);
		arca[1] = new Pareja( 
				new Perro("Paco"),
				new Perro("Lola"));
		arca[2] = new Pareja(
				new Raton("Mickey"), 
				new Raton("Minnie")); // Si ponemos "Minnie", el compilador no detectará el error
		
		for (int i = 0; i < 4; i++) {
			// Todos los dias alimentar los animales
		    for (int j = 0; j < 3; j++) {
		    	Pareja p = arca[j];
		    	Animal macho = (Animal) p.getObjeto1();
		    	macho.comer();
		    	Animal hembra = (Animal) p.getObjeto2();
		    	hembra.comer();		    	
		    }
		}
	}
	
	public void ejecutarV2() {
		ParejaV2[] arca = new ParejaV2[4];
		arca[0] = new ParejaV2(
					new Pato("Donald"),
					new Pato("Daisy")
				);
		arca[1] = new ParejaV2( 
				new Perro("Paco"),
				new Perro("Lola"));
		arca[2] = new ParejaV2(
				new Raton("Mickey"), 
				new Raton("Minnie"));
		arca[3] = new ParejaV2(
					new Perro("Pluto"),
					new Raton("Minnie")); // La definición de ParejaV2 permite estas mezclas...
		
		
		
		for (int i = 0; i < 4; i++) {
			// Todos los dias alimentar los animales
		    for (int j = 0; j < 4; j++) {
		    	ParejaV2 p = arca[j];
		    	p.comer();
		    }
		}
		
	}
	

	public void ejecutarV3() {
		// La declaración de arca indica que es un arreglo de Parejas donde
		// los elementos de cada pareja son de algún tipo que extienda al tipo Animal
		ParejaV3<? extends Animal>[] arca = new ParejaV3[4]; // Se instancia con 3 posiciones para Parejas
		arca[0] = new ParejaV3<Perro>(new Perro("Goofy"),
				new Perro("GoofyGirl"));
		arca[1] = new ParejaV3<Pato>( // La primer Pareja está definida específicamente con el tipo Pato
				new Pato("Donald"),
				new Pato("Daisy")
			);
		arca[2] = new ParejaV3<Perro>(
				new Perro("Paco"),
				new Perro("Lola"));
		arca[3] = new ParejaV3<Raton>(
				new Raton("Mickey"), 
				new Raton("Minnie"));
		
		for (int i = 0; i < 4; i++) {
			// Todos los dias alimentar los animales
		    for (int j = 0; j < arca.length; j++) {
		    	ParejaV3 p = arca[j];
		    	p.comer();
		    }
		}
		
		

	}
	
	

	public static void main(String[] args) {
		SimulacionArcaDeNoe simulacion = new SimulacionArcaDeNoe();
		simulacion.ejecutarV3();

	}

}
