package com.violiveiradev.cursojava.aula13.exercicios;

import java.util.Scanner;

public class ConversorTemperatura {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double f = scan.nextDouble();

        double c = (5 * (f-32) / 9);

        System.out.println("A temperatura " + f + " F é igual a " + c + " C");


        System.out.println("Digite a temperatura em Celcius: ");
        double C = scan.nextDouble();

        double F = (C * 1.8) + 32;

        System.out.println("A temperatura " + C + " C é igual a " + F + " F");


    }
}
