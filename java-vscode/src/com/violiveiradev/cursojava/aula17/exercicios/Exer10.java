package com.violiveiradev.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num01 = sc.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int num02 = sc.nextInt();

        if (num01 < num02){
            for ( int i = 1 + num01; i < num02; i++ ){
                System.out.println(i);
            }
        } else {
            for ( int i = num01 - 1; i > num02; i-- ){
                System.out.println(i);
            }
        }
    }
}
