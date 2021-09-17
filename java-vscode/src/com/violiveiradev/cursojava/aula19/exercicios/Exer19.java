package com.violiveiradev.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exer19 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] nota1 = new double[3];
        double[] nota2 = new double[nota1.length]; 
        double[] result = new double[nota1.length];
        double notaCorte = 7;

        for (int i = 0; i < nota1.length; i++){
            System.out.println("Digite a nota 1 do aluno: " + (i+1));
            nota1[i] = sc.nextDouble();

            System.out.println("Digite a nota 2 do aluno: " + (i+1));
            nota2[i] = sc.nextDouble();

            result[i] = (nota1[i] + nota2[i]) / 2;
        }

        System.out.print("Notas 1 = ");
        for (int i = 0; i < nota1.length; i++){
            System.out.print(nota1[i] + " ");
        }
        System.out.println();
        
        System.out.print("Notas 2 = ");
        for (int i = 0; i < nota2.length; i++){
            System.out.print(nota2[i] + " ");
        }
        System.out.println();

        System.out.println("\nResultado : ");
        for (int i = 0; i < result.length; i++){
            //System.out.print();
            if ( result[i] >= notaCorte){
                System.out.print("\n Aluno: "+ i + " - " + result[i] + " APROVADO!");
            } else if ( result[i] < notaCorte){
                System.out.print("\n Aluno: "+ i + " - " + result[i] + " REPROVADO!");
            }
        }
        System.out.println();
    }
}
