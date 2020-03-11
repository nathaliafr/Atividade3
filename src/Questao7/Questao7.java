package Questao7;

//Nathalia Felix da Rocha - 192010010016

/*
Questao 7: [2.0 pontos] Escreva um programa que apresente na tela uma tabela contendo valores de
graus Celsius e o seu valor em graus Fahrenheit. Utilize os valores de graus Celsius comecando em
zero (‘0’) e aumentando de 30 em 30 ate chegar em 300 (0; 30; 60; 90; . . . ; 300).
 */
public class Questao7 {
    public static void main(String[] args) {

        Questao7 obj = new Questao7();
        obj.temperatura(); //chama o metodo

    }

    public void temperatura(){

        int celsius, fahrenheit;

        System.out.println("Celsius: \t Fahrenheit: \n");

        //for para realizar o calculo de 30 em 30
        for (celsius=0; celsius<=300; celsius+=30){

            //calculo da temperatura
            fahrenheit = ((9*celsius)/5)+32;

            //imprime
            System.out.println(celsius + "\t\t\t\t" + fahrenheit + "\n");
        }

    }
}
