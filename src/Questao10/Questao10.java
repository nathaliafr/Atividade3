package Questao10;

import java.util.Scanner;

/*
*Questao 10: [4.0 pontos] Escreva um programa que receba dois numeros e calcule a o primeiro elevado
ao segundo (operacao de exponencial). Obs.: Crie sua propria implementacao da operacao de
exponenciacao, sem utilizar os meetodos da classe Math.
 */


//Nathalia Felix da Rocha - 192010010016


public class Questao10 {

    public static void main(String[] args) {

        Questao10 obj = new Questao10();
        obj.exponecial(); //chama o metodo

    }

    public void exponecial() {

        int numero1, numero2, ex=1;
        //recebe os dois numeros
        System.out.println("digite o valor da base: \n");
        Scanner nu = new Scanner(System.in);
        numero1 = nu.nextInt();
        System.out.println("digite o valor do exponte: \n");
        Scanner nu1 = new Scanner(System.in);
        numero2 = nu.nextInt();


        for (int i = 0; i<numero2; i++){
            //calculo exponencial
                ex = ex * numero1;
            System.out.println("valor : " + ex);
        }

    }
}
