package es.florida.AE03_Multihilo;

//Clase Minero. Con sus constructores y valores de atributos ya detereminados
public class Minero {

	int bolsa = 0;
	int tiempoExtraccion = 2000; // duraci�n del turno de recoleccion

	public Minero() {
	}

	public Minero(int bolsa, int tiempoExtraccion) {
		this.bolsa = bolsa;
		this.tiempoExtraccion = tiempoExtraccion;
	}

	
	/*METODO: extaerRecurso()
	 * ACTION: recibe el nombre del minero y el turno en el que est� trabajando. Mientras hayan 
	 * recursos disponibles para extraer, extraer� un recurso, lo sumar� a su bolsa y descontar�
	 * un recurso del total disponible. Mostrar� un mensaje con la acci�n y la cantidad que lleva 
	 * acumulada en su bolsa. Se sincroniza el condicional para que no accedan varios 
	 * hilos a la vez a descontar recursos y crear inconsistencias. Se ha usado un bucle para 
	 * sobrecargar el procesador y as� la aplicaci�n responda correctamente.
	 * INPUT:	nombre del minero y turno en el que est� trabajando
	 * OUTPUT: 	mensaje con nombre, turno y cantidad en la bolsa.*/
	public void extraerRecurso(String nombre, int turno) {

		for (int i = 0; i < 1e8; i++) {
			double sobrecargaCPU = Math.sqrt((double) (i));
		}
		synchronized (this) {
			if (App.orosDisponibles > 0) {
				App.orosDisponibles -= 1;
				bolsa++;
				System.out.println("Turno_" + turno + "  >>  " + nombre + "	>>  1 recurso  >>   Bolsa: " + bolsa);
			} else {
				System.out.println("Turno_" + turno + "  >>  " + nombre
						+ "	>>  La mina se ha quedado sin recursos  >>   Bolsa: " + bolsa);
			}
		}
	}
}