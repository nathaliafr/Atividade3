package Questao8;

import java.util.Scanner;

//Nathalia Felix da Rocha - 192010010016

/*
 * Questao 8: [3.0 pontos] Escreva um programa que receba do usuario as notas das tres atividades de
 * um aluno (lista de exercicios, apresentacao do seminario e prova final) e calcule a media final da
 * disciplina, que sera efetivada por media ponderada com pesos das notas: 2, 3 e 5 respectivamente.
 * Entao o programa deve apresentar na tela a media final do aluno e a situacao dele na disciplina,
 * que sera �Aprovado� caso o aluno obtenha media maior ou igual a 6, ou �Retido� caso contrario. A
 * media ponderada pode ser obtida pela soma dos valores multiplicados pelo respectivo peso, divida pela soma dos pesos.
 */

public class Questao8 {

	public static void main(String[] args) {
		Questao8 obj = new Questao8();
		obj.calculoMedia(); //chama o metodo

	}
	
	private void calculoMedia() {
		double lista, seminario, prova, media;

		//entrada de dado
		System.out.println("Digite a nota da lista de exercicio: \n");
		Scanner li = new Scanner(System.in);
		 lista = li.nextDouble();

		//entrada de dado
		System.out.println("Digite a nota da apresentacao do seminario: \n");
		Scanner as = new Scanner(System.in);
		seminario = as.nextDouble();

		//entrada de dado
		System.out.println("Digite a nota da prova final: \n");
		Scanner pv = new Scanner(System.in);
		prova = pv.nextDouble();

		//calculo da media
		 media = (lista*0.2)+(seminario*0.3)+(prova*0.5);
		 
		 System.out.println("A media final e " + media);
		 
		 if (media<6) { // verifica se foi retido
			System.out.println("Retido");
		}else { // verifica se foi retido
			System.out.println("Aprovado");
		}
	}
}
