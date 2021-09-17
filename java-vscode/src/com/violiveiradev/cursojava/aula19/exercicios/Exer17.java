package com.violiveiradev.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exer17 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }

        int qtdmaior35 = 0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] > 35){
                qtdmaior35++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("A quantidade de pessoal com idade maior que 35: " + qtdmaior35);
        
    }
}
