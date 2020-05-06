package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System .in);
		
		
		char sexo;
		int cervejas, refri, espetos;
		double consumo, couvert, ingresso, total;
		
		//Leitura dos dados
		
		System.out.print("Sexo: ");		
		sexo = sc.next().charAt(0);
		
		System.out.print("Quantidade de Cervejas: ");		
		cervejas = sc.nextInt();
		
		System.out.print("Quantidade de Refrigerantes: ");		
		refri = sc.nextInt();
		
		System.out.print("Quantidade de Espetinhos: ");		
		espetos = sc.nextInt();
		
		// Calculos
		
		if ( sexo == 'F') {
			
			ingresso = 8.0;			
		}
		
		else { 
			ingresso = 10.0;
				
		}
		
		consumo = cervejas * 5 + refri * 3.0 + espetos * 7.0;
		
		if ( consumo > 30) {
			
			couvert = 0.0;
			
		}
		
		else {
			couvert = 4.0;
		}
		
		total = ingresso + consumo + couvert;
		
		// Relatorio
		
		System.out.println();
		System.out.println ("RELATÓRIO: ");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if (couvert == 0.0) {
			System.out.println("Isento de Couvert");
		}
		else {
			
			System.out.printf("Couvert = R$ %.2f%n" , couvert);
		}
		
		System.out.printf("Ingresso = R$ %.2f%n" , ingresso);
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n" , total);
		
		sc.close();

	}

}
