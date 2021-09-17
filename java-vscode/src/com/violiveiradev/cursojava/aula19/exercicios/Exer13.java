package com.violiveiradev.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exer13 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i=0; i < vetorA.length; i++){
            if (vetorA[i] % 5 == 0){
                soma += vetorA[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.print("Soma = " + soma);

        System.out.println();
    }
}
