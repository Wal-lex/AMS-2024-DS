package ex_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de dinheiro: ");
		double reais = sc.nextDouble();
		
		double dolar = reais/1.80;
		double marco = reais/2;
		double libra = reais/1.57;
		
		System.out.println("A convers�o em D�lar �: " + dolar);
		System.out.println("A convers�o em  Marco Alem�o �: " + marco);
		System.out.println("A convers�o em Libra Esterlina �: " + libra);
		
	}

}