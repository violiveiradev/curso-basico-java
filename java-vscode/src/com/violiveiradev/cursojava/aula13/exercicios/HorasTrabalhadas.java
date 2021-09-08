package com.violiveiradev.cursojava.aula13.exercicios;

import java.util.Scanner;

public class HorasTrabalhadas {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;
        
        System.out.println("O salário é de: " + salario);


    }
}
