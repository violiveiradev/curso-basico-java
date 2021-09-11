package com.violiveiradev.cursojava.aula15.exercicios;

import java.util.Scanner;

public class NumeroNegativoPositivo {
    
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);

        System.out.println("Degite um número aleatório positivo ou negativo:");
        double num1 = scan.nextDouble();

        if (num1 > 0){
           System.out.println("O número " + num1 + " é positivo.");
        } else if (num1 == 0){
            System.out.println("O número " + num1 + " é neutro.");
        }else {
            System.out.println("O número " + num1 + " é negativo.");
        }
    }
}
