package Questao4;

import java.util.Scanner;

//Nathalia Felix da Rocha - 192010010016
/*
 * Questao 4: [1.5 ponto] Escreva um programa que receba um numero e informe se ele e par ou impar.
 */

public class Questao4 {

	public static void main(String[] args) {

		//entrada do numero
		System.out.println("Digite um numero: ");
		Scanner sca = new Scanner(System.in);
		int val = sca.nextInt();

		//calcula o resto do numero divididopor 2
		int resto = val%2;
		if(resto==0) { //verifica se é par
			System.out.println("O valor e par");
		}if(resto==1) { //verifica se é impar
		System.out.println("O valor e impar");
		}
	}
}