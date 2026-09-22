package Minijuegos;

import java.util.Scanner;

public class Aventura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Vida del usuario //
		int vida = 100;
		
		System.out.println("Comienza una nueva aventura en Java");
		System.out.println("Vida actual: " + vida + " PV\n");
		
		// Comienzo del minijuego //
		
		System.out.println("Despiertas después de un largo sueño, frente a ti hay dos puertas");
		System.out.println("Opcion 1: Abrir puerta de aspecto tenebroso (se escuchan pequeños pasos)");
		System.out.println("Opcion 2: Abrir puerta de aspecto normal (ves como salen rayos de luz bajo la puerta)");
		System.out.println("Que puerta eliges? (escribe 1 o 2)");
		
		// Toma de Decisiones //
		
		int opcion1 = teclado.nextInt();
	}

}
