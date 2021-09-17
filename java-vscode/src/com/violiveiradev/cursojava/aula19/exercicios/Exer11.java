package com.violiveiradev.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exer11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5]; 
        //int p = 0;
        //int soma = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = sc.nextInt();

            //p = vetorA[i] % 2;

            //if (p == 0){
                //soma += 1;
            //}
        }
        int qtdPares = 0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                qtdPares++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        //System.out.print("Qtd números pares = " + soma);
        System.out.println("Qtd números pares: " + qtdPares);

        System.out.println();
    }
}
