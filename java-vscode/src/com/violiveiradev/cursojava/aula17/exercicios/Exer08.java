package com.violiveiradev.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        int soma = 0; 
        int media;

        for ( int i = 0; i < 5; i++){
             System.out.println("Digite um numero: ");
            num = sc.nextInt();

            soma += num;
        }
        
        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
