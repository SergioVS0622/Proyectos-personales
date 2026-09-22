package Calculadoras;
import java.util.Scanner;

public class CalculoAreas3_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Base:");
				 double base = teclado.nextDouble();
		System.out.print("Alto:");
				double alto = teclado.nextDouble();
		
		       
		
		if (base <=0 || alto <= 0) {
			System.out.println("Error! Ningúin valor puede ser igual a 0 o negativas");
			
		}else {
			// --- Cálculo de área ---//
			double area = base * alto;
			System.out.println("Area:" + area);
			// --- Cálculo de perímetro ---//
			double perimetro = 2 * (base + alto);
			System.out.println("Perimetro:" + perimetro);
		}
		
		teclado.close();
	}
}



