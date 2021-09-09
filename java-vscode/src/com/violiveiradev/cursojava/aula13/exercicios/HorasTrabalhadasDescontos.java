package com.violiveiradev.cursojava.aula13.exercicios;

import java.util.Scanner;

public class HorasTrabalhadasDescontos {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDesconto = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDesconto;
        
        System.out.println("O salário bruto é de: " + salarioBruto);
        System.out.println("O INSS é: " + inss);
        System.out.println("O sindicato é: " + sindicato);
        System.out.println("O imposto de renda é: " + ir);
        System.out.println("O total de desconto é: " + totalDesconto);
        System.out.println("O salário liquido é: " + salarioLiquido);


    }
}

