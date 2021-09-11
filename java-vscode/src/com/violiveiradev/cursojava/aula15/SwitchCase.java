package com.violiveiradev.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de 1-7");

        int diaSemana = scan.nextInt();

        switch(diaSemana){
        case 1: System.out.println("Domingo"); break;
        case 2: System.out.println("Segunda"); break;
        case 3: System.out.println("Terça"); break;
        case 4: System.out.println("Quarta"); break;
        case 5: System.out.println("Quinta"); break;
        case 6: System.out.println("Sexta"); break;
        case 7: System.out.println("Sabado"); break;
        default: System.out.println("Não é um dia da semana.");
        }

        switch(diaSemana){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia util."); break;
            case 1:
            case 7: System.out.println("Fim de semana."); break;
            default: System.out.println("Não é um dia da semana.");
            }


    }
}
