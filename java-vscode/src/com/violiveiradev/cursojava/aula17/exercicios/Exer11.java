package com.violiveiradev.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite um número inteiro: ");
        int num01 = sc.nextInt();
    
        System.out.println("Digite outro número inteiro: ");
        int num02 = sc.nextInt();

        int soma = 0;

        for ( int i = num01; i <= num02; i++ ){
            soma += i;
        }
        
        System.out.println(soma);
    }
}
