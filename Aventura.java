package Minijuegos;

import java.util.Scanner;

public class Aventura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Vida del usuario //
		int vida = 100;
		int daño = 50;
		int vendajes = 25;
		
		System.out.println("Comienza una nueva aventura en Java");
		System.out.println("Vida actual: " + vida + " PV\n");
		
		// Comienzo del minijuego //
		
		System.out.println("Despiertas después de un largo sueño, frente a ti hay dos puertas");
		System.out.println("Opcion 1: Abrir puerta de aspecto tenebroso (se escuchan pequeños pasos)");
		System.out.println("Opcion 2: Abrir puerta de aspecto normal (ves como salen rayos de luz bajo la puerta)");
		System.out.println("Que puerta eliges? (escribe 1 o 2)");
		
		// Toma de Decisiones //
		
		int eleccion1 = teclado.nextInt();
		if (eleccion1 == 1) {
			System.out.println("Te encuentras con mounstros y te atacan, logras escapar pero sales herido");
			vida -= daño;
			System.out.println("Vida restante:" + vida );
			System.out.println("Después de escapar, te encuentras con lo que parece un asentamiento");	
			System.out.println("Podrían haber recursos, pero desconoces si esta inhabitado, qué haces?");
			System.out.println("Opción 1: Saquear el asentamiento");
			System.out.println("Opción 2: Ignorarlo y seguir adelante");
		int eleccion2 = teclado.nextInt();
		if (eleccion2 == 1) {
			System.out.println("Consigues recursos sin encontrarte a nadie, obtienes comida y vendajes");
			System.out.println("Te sientes mejor despúes de aplicar el vendaje");
			System.out.println("Vida restante:" + (vida - 25));
		}
			
		}	
		
		if (eleccion1== 2) {
			System.out.println("Te encuentras con exploradores y continúas con ellos, al parecer la luz venía de una linterna...");
			System.out.println("Despúes de acompañarlos, te separas y te dan vendajes");
			
			System.out.println("Caminando más adelante tienes la opción de subir una cuerda o seguir el camino de la cueva");
		}		
		
		
}
}
