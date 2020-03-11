package Questao1;

import java.util.Scanner;

//Nathalia Felix da Rocha - 192010010016

/*
 * Questao 9: [3.0 pontos] Escreva um programa que receba tres numeros e os apresente em ordem crescente
 * (o menor primeiro, entao o mediano e depois o maior).
 */

public class Questao1 {

    public static void main(String[] args) {

        Questao1 obj = new Questao1();
        obj.ordenacao(); //chama o metodo

    }

    public void ordenacao() {

        int numero1, numero2, numero3;

        //entrada do dado
        System.out.println("um valor: \n");
        Scanner nu = new Scanner(System.in);
        numero1 = nu.nextInt();

        //entrada do dado
        System.out.println("um valor: \n");
        Scanner nu1 = new Scanner(System.in);
        numero2 = nu1.nextInt();

        //entrada do dado
        System.out.println("um valor: \n");
        Scanner nu2 = new Scanner(System.in);
        numero3 = nu2.nextInt();

        //primeira verificação com o 1 sendo maior numero
        if(numero1<numero2 && numero1<numero3) {
            if(numero2<numero3) {
                System.out.println(numero1 + " " + numero2 + " " + numero3);
            }else if (numero3<numero2) {
                System.out.println(numero1 + " " + numero3 + " " + numero2);
            }
        }
        //segunda verificação com o 2 sendo maior numero
        if(numero2<numero3 && numero2<numero1) {
            if(numero1<numero3) {
                System.out.println(numero2 + " " + numero1 + " " + numero3);
            }else if (numero3<numero1) {
                System.out.println(numero2 + " " + numero3 + " " + numero1);
            }
        }
        //terceira verificação com o 3 sendo maior numero
        if(numero3<numero1 && numero3<numero2) {
            if(numero2<numero1) {
                System.out.println(numero3 + " " + numero2 + " " + numero1);
            }else if (numero1<numero2) {
                System.out.println(numero3 + " " + numero1 + " " + numero2);
            }
        }

    }

}
