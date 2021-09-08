package com.violiveiradev.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Soma {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        //int x = 0;
        //int y = 0;

        System.out.println("Digite o primeiro numero: ");
        int x = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int y = scan.nextInt();

        int soma = x + y;
        
        System.out.println("O resultado da soma é:  " + soma);


    }
}
