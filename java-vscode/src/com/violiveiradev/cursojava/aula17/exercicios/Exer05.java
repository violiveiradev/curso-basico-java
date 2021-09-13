package com.violiveiradev.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        boolean infovalida = false;
        long popA = 0;
        long popB = 0;
        int count = 0;
        double taxaA = 0;
        double taxaB = 0;
        String reiniciar;

        do {
            infovalida = false;
            do {
                System.out.println("Informe a população do pais A:");
                popA = scan.nextLong();
                if (popA > 0){
                    infovalida = true;
                } else {
                    System.out.println("O valor da população precisa ser maior que 0.");
                }
            } while(!infovalida);

            infovalida = false;
            do {
                System.out.println("Informe a população do pais B:");
                popB = scan.nextLong();
                if (popB > 0){
                    infovalida = true;
                } else {
                    System.out.println("O valor da população precisa ser maior que 0.");
                }
            } while(!infovalida);

            infovalida = false;
            do {
                System.out.println("Informe a taxa de crescimento do pais A:");
                taxaA = scan.nextDouble();
                if (taxaA > 0){
                    infovalida = true;
                } else {
                    System.out.println("O valor de crescimento precisa ser maior que 0.");
                }
            } while(!infovalida);

            infovalida = false;
            do {
                System.out.println("Informe a taxa de crescimento do pais B:");
                taxaB = scan.nextDouble();
                if (taxaB > 0){
                    infovalida = true;
                } else {
                    System.out.println("O valor de crescimento precisa ser maior que 0.");
                }
            } while(!infovalida);

            while (popA < popB) {

                popA += (popA / 100) * taxaA;
                popB += (popB / 100) * taxaB;
                count++;
            }

            System.out.println("Levara " + count + " anos para o pais 'A' alcanse o pais 'B' em população.");
            System.out.println("Pais A população: " + popA);
            System.out.println("Pais B população: " + popB);

            System.out.println("Deseja fazer um novo calculo? ");
            System.out.println("Sim: 'S'");
            System.out.println("Não: 'N'");
            reiniciar = scan.next();

            if (reiniciar.equalsIgnoreCase("s")) {
                infovalida = false;
            } else {
                System.out.println("Programa finalizado.");
                infovalida = true;
            }
        } while(!infovalida);
    }
}
