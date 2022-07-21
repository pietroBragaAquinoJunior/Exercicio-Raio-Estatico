package main;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o raio: ");
		double raio = sc.nextDouble();
		
		System.out.printf("Circunferência: %.2f%n",Calculator.circumference(raio));
		System.out.printf("Volume: %.2f",Calculator.volume(raio));
		
		sc.close();
	}

}
