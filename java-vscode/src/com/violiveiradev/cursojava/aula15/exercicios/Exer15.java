package com.violiveiradev.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exer15 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o lado 1:");
        int lado1 = scan.nextInt();
        
        System.out.println("Digite o lado 2:");
        int lado2 = scan.nextInt();
        
        System.out.println("Digite o lado 3:");
        int lado3 = scan.nextInt();
        
        if ((lado1 < (lado2 + lado3)) && 
                (lado2 < (lado1 + lado3)) && 
                (lado3 < (lado1 + lado2))){
            
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo Isóceles");
            }
            
        } else {
            System.out.println("As medidas não forma um triângulo");
        }
    }
}
