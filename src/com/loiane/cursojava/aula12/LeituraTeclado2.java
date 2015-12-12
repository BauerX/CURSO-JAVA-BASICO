package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraTeclado2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura, e se tem animais:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat(); // ao preencher usar virgula ex: 1,72 se usar ponto da errado
		boolean temAnimais = scan.nextBoolean();
		
		
		System.out.println("Voce digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Tem Filhos: " + qtdFilhos);
		System.out.println("Sua altura: " + altura);
		System.out.println("Tem animais? " + temAnimais);
		
		


	}

}
