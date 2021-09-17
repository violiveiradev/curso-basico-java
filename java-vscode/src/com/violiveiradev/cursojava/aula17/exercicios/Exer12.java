package com.violiveiradev.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exer12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean flag = false;

        do {
            System.out.println("Digite o número operador da tabuada: ");
            int operador = sc.nextInt();

            System.out.println("Tabuada de " + operador + ":");
            for (int i = 0; i <= 10; i++){
                System.out.println(operador + " x " + i + " = " + operador * i);
            }

            System.out.println("\nDeseja visualizar uma nova tabuada? ");
            System.out.println("Sim: 'S'");
            System.out.println("Não: 'N'");
            String reiniciar = sc.next();

            if (reiniciar.equalsIgnoreCase("s")) {
                flag = false;
            } else {
                System.out.println("Programa finalizado.");
                flag = true;
            }

        } while(!flag);

    }
}
