package Calculadoras;
import java.util.Scanner;

public class CalculoAreas3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Base:");
				 int base = teclado.nextInt();
		System.out.print("Alto:");
				int alto = teclado.nextInt();
		
		       
		
		if (base <=0 || alto <= 0) {
			System.out.println("Error! Ningúin valor puede ser igual a 0 o negativas");
			
		}else {
			// --- Cálculo de área ---//
			int area = base * alto;
			System.out.println("Area:" + area);
			// --- Cálculo de perímetro ---//
			int perimetro = 2 * (base + alto);
			System.out.println("Perimetro:" + perimetro);
		}
		
		teclado.close();
	}
}



