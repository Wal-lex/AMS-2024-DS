package ex_3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o nome: ");
	String nome = sc.nextLine();
	
	System.out.print("Digite o seu sal�rio fixo: ");
	double salario = sc.nextDouble();
	
	System.out.print("Digite o valor de suas vendas esse m�s: ");
	double vendas = sc.nextDouble();
	
	double comissao = vendas*0.04;
	
	double f = comissao + salario;
	
	System.out.println("Ol� " + nome +", a sua comiss�o deste m�s � de R$" + comissao + " e o seu sal�rio final � R$" + f);
	
	}
}