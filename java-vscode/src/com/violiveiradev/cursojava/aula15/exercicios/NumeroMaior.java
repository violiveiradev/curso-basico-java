package com.violiveiradev.cursojava.aula15.exercicios;

import java.util.Scanner;

public class NumeroMaior {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

       System.out.println("Degite um número:");
       int num1 = scan.nextInt();
       
       System.out.println("Degite outro número:");
       int num2 = scan.nextInt();

       if (num1 > num2){
           System.out.println("O número " + num1 + " é maior.");
       } else {
        System.out.println("O número " + num2 + " é maior.");
       }
    }
}
