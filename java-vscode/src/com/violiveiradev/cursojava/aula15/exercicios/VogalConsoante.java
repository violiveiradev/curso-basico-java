package com.violiveiradev.cursojava.aula15.exercicios;

import java.util.Scanner;

public class VogalConsoante {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Degite uma letra:");
        String letra = scan.next();

        if (letra.length() > 1){
            System.out.println(letra + ": Não é uma letra.");
        }else {
            switch(letra){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U": System.out.println(letra + ": É uma vogal");break;
                default: System.out.println(letra + ": É uma consoante.");
            }
        }
    }
}

