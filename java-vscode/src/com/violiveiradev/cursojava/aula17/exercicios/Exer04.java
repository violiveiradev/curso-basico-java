package com.violiveiradev.cursojava.aula17.exercicios;

public class Exer04 {
    public static void main(String[] args) {
        
        long popA = 80000;
        long popB = 200000;
        int count = 0;

        while (popA < popB) {

            popA += (popA / 100) * 3;
            popB += (popB / 100) * 1.5;
            count++;
        }

        System.out.println("Levara " + count + " anos para o pais 'A' alcanse o pais 'B' em população.");
        System.out.println("Pais A população: " + popA);
        System.out.println("Pais B população: " + popB);

    }
}
