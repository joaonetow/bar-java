package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System .in);
		
		
		char sexo;
		int cervejas, refri, espetos;
		
		System.out.print("Sexo: ");		
		sexo = sc.next().charAt(0);
		
		System.out.print("Quantidade de Cervejas: ");		
		cervejas = sc.nextInt();
		
		System.out.print("Quantidade de Refrigerantes: ");		
		refri = sc.nextInt();
		
		System.out.print("Quantidade de Espetinhos: ");		
		espetos = sc.nextInt();
		
		sc.close();

	}

}
