package Questao3;

import java.util.Scanner;


//Nathalia Felix da Rocha - 192010010016
/*
 * Questao 3: [1.5 ponto] Escreva um programa que apresente um menu para o usuario selecionar uma
 *das quatro operacoes fundamentais (soma, subtracao, multiplicacao ou divisao) e apos o usuario
 *selecionar a operacao, permita ao usuario inserir dois numeros e apresente o resultado da operacao
 *selecionada com estes numeros.
 */

public class Questao3 {

	public static void main(String[] args) {


		int val, val1;

		//menu para escolha de opecao
		System.out.println("Escolha uma operacao:\n"
				+ "1. Soma\n"
				+ "2. Subtracao\n"
				+ "3. Multiplicacao\n"
				+ "4. Divisao");
		Scanner sca = new Scanner(System.in);
		int op = sca.nextInt();
		
		
		switch (op) {
		case 1:

			//entrada dos dois numeros
			System.out.println("Digite o primeiro numero");
			Scanner sca1 = new Scanner(System.in);
			val = sca1.nextInt();
			System.out.println("Digite o primeiro numero");
			Scanner sca2 = new Scanner(System.in);
			val1 = sca2.nextInt();

			//calculo soma
			int soma = val+val1;
			System.out.println("O resultado da soma e: " + soma);
			
			break;
		case 2:

			//entrada dos dois numeros
			System.out.println("Digite o primeiro n�mero");
			Scanner sca3 = new Scanner(System.in);
			val = sca3.nextInt();
			System.out.println("Digite o primeiro n�mero");
			Scanner sca4 = new Scanner(System.in);
			val1 = sca4.nextInt();

			//calculo subtrcao
			int subtracao = val-val1;
			System.out.println("O resultado da subtracao e: " + subtracao);
			
			break;
		case 3:

			//entrada dos dois numeros
			System.out.println("Digite o primeiro n�mero");
			Scanner sca5 = new Scanner(System.in);
			val = sca5.nextInt();
			System.out.println("Digite o primeiro n�mero");
			Scanner sca6 = new Scanner(System.in);
			val1 = sca6.nextInt();

			//calculo multiplicacao
			int multiplicacao = val*val1;
			System.out.println("O resultado da Multiplicacao e: " + multiplicacao);
			
			break;
		case 4:

			//entrada dos dois numeros
			System.out.println("Digite o primeiro n�mero");
			Scanner sca7 = new Scanner(System.in);
			val = sca7.nextInt();
			System.out.println("Digite o primeiro n�mero");
			Scanner sca8 = new Scanner(System.in);
			val1 = sca8.nextInt();

			//calculo divisao
			int divisao = val/val1;
			System.out.println("O resultado da Divis�ao e: " + divisao);
			
			break;

		default:
			break;
		}
	
	}

}
