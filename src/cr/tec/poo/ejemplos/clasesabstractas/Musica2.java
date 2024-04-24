package cr.tec.poo.ejemplos.clasesabstractas;

/**
 * Otra versión del ejemplo de la orquesta.
 * Demuestra el uso de clases abstractas
 */

/**
 * Representa una nota musical
 */
class Note {
  private String value;

  // constructor privado
  private Note (String value) {
    this.value = value;
  }

  public String toString() {
    return value;
  }

  // Constantes:
  public static final Note DO = new Note("DO");
  public static final Note RE = new Note("RE");
  public static final Note MI = new Note("MI");
  // etc.
}

/**
 * Representa un instrumento musical
 */

abstract class Instrument {
  // la implementación de play() es específica de cada Instrumento
   abstract public void play (Note n);

  // Asumamos que la implementación de tune() sí puede ser generalizable,
  // es decir, implementable en Instrument, y que como parte de su
  // implementación se debe invocar a play();
  // es decir, tune() es un Template Method (Design Patterns)
  public void tune() {
    System.out.println("Afinando un instrumento");
    if (this instanceof ElectricGuitar) {
        ((ElectricGuitar) this).encender();
    }

    
    // ...
    // La invocación a play() es polimórfica
    play(Note.DO);
    play(Note.RE);
    play(Note.MI);
    //...
    System.out.println("Instrumento afinado");
  };
}

// Tipos específicos de instrumento


class  Guitar extends Instrument {
	
  public void play (Note n) {
	    System.out.println("Una guitarra tocando la nota " + n);
  }
  
}

class ElectricGuitar extends Guitar {
	boolean encendida = false;

	@Override
	public void play(Note n) {
		if (! encendida) {
			throw new RuntimeException("Error, la guitarra está apagada!");
		}
		System.out.println("Una guitarra electricamente tocando la nota " + n);
	}
	
	public void encender() {
		encendida = true;
		System.out.println("Encendiendo la guitarra eléctrica");
	}
	
}


class  Piano extends Instrument {

  public void play (Note n) {
    System.out.println("Un piano tocando la nota " + n);
  }
}

class  Violin extends Instrument {

  public void play (Note n) {
    System.out.println("Un violín tocando la nota " + n);
  }
}


public class Musica2 {


  static Instrument[] orchestra  = { new ElectricGuitar(), new  Piano() , new Violin() };

  public static void main ( String[] args) {
	  
    System.out.println("Preparando la orquesta...");
    for (int i = 0; i < orchestra.length; i++) {
      try {	
        orchestra[i].tune();
      }
      catch (RuntimeException e) {
    	  System.out.println("Se produjo un error: " + e.getMessage());
    	  e.printStackTrace();
      }
    }
    System.out.println("Ya se puede iniciar el concierto!");
    
  }
  
  
}

