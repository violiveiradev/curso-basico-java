package com.violiveiradev.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for ( int i = 0; i < 5; i++){
            System.out.println("Digite o numero: ");
            num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
    }
}
