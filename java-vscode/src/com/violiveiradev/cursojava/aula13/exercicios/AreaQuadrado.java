package com.violiveiradev.cursojava.aula13.exercicios;

import java.util.Scanner;

public class AreaQuadrado {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = Math.pow (lado, 2);
        
        System.out.println("A area do quadrado é:  " + area);
        System.out.println("O dobro da area do quadrado é: " + (area * 2));


    }
}
