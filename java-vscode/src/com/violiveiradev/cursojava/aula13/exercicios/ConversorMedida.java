package com.violiveiradev.cursojava.aula13.exercicios;

import java.util.Scanner;

public class ConversorMedida {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a medida em metro: ");
        double x = scan.nextDouble();

        double cm = x * 100;
        
        System.out.println("A medida em cm:  " + cm);


    }
}