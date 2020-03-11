package Questao6;

import java.util.Scanner;

//Nathalia Felix da Rocha - 192010010016

public class Questao6 {
	
	public void dobrar() {

		//entrada do numero
		System.out.println("Digite um numero: ");
		Scanner sca = new Scanner(System.in);
		int val = sca.nextInt();
		//calculo do dobro
		int dobro = val*2;
		System.out.println("O dobro do numero digitado e: " + dobro);
	}

}
