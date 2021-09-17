package com.violiveiradev.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exer16 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }
        
        int menor15 = 0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] < 15){
                menor15 += vetorA[i];
            }
        }

        int igual15 = 0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] == 15){
                igual15++;
            }
        }

        int soma = 0;
        int qtd = 0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] > 15){
                soma += vetorA[i];
                qtd++;
            }
        }
        
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Soma do vetorA inferior á 15: " + menor15);
        System.out.println("Qtd de elementos igual á 15: " + igual15);
        System.out.println("Média dos elementos no vetor superiores a 15: "+ soma/qtd);
    }    
}
