package com.violiveiradev.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exer23 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Digite um número para a posição " + i);
            vetorA[i] = scan.nextInt();
            
            if (vetorA[i] % 2 != 0){
                break;
            }
        }
    }    
}
