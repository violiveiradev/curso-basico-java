package com.violiveiradev.cursojava.aula13.exercicios;

import java.util.Scanner;

public class PesoIdeal {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = scan.nextDouble();

        double peso = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + peso);
    }
}
