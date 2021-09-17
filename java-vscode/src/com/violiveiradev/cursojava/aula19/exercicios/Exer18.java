package com.violiveiradev.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exer18 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] idades = new int[4];
        
        for (int i=0; i<idades.length; i++){
            System.out.println("Digite a idade da pessoa: " + (i + 1));
            idades[i] = scan.nextInt();
        }
        
        int menor = idades[0];
        int maior = idades[0];
        int indexMenor = 0;
        int indexMaior = 0;

        for (int i = 1; i < idades.length; i++){
            if (idades[i] < menor){
                menor = idades[i];
                indexMenor = i;
            } else if (idades[i] > maior){
                maior = idades[i];
                indexMaior = i;
            }
        }
        
        System.out.print("Idades = ");
        for (int i=0; i<idades.length; i++){
            System.out.print(idades[i] + " ");
        }

        System.out.println();

        System.out.println("Menor idade:  " + menor);
        System.out.println("Indice menor idade:  " + indexMenor);
        System.out.println("Maior idade:  " + maior);
        System.out.println("Indice maior idade:  " + indexMaior);
    }    
}
