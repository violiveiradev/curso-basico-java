package com.violiveiradev.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exer01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Digite uma nota de 0 - 10.");

        double nota = scan.nextDouble();

        if (nota >=0 && nota <= 10){
            notaValida = true;
            System.out.println("Nota: " + nota); 
        } else {
            System.out.println("Este numero é invalido!"); 
        }

        } while (!notaValida);

        
        
    }
}
