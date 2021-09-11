package com.violiveiradev.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exer18 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o um número");
        int num = scan.nextInt();
        
        if (num % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }
    }
}
