package com.violiveiradev.cursojava.aula13.exercicios;

import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow (raio, 2);
        
        System.out.println("A area do circulo é:  " + area);


    }
}
