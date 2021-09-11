package com.violiveiradev.cursojava.aula15.exercicios;

import java.util.Scanner;

public class ValidarSexo {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Degite seu sexo:");
        System.out.println("F - Feminino | M - Masculino | N - Não informar");

        String letraResposta = scan.next();

        if (letraResposta.equalsIgnoreCase("f")){
           System.out.println("Sexo Feminino registrado.");
        } else if (letraResposta.equalsIgnoreCase("m")){
            System.out.println("Sexo Masculino registrado.");
        }else if (letraResposta.equalsIgnoreCase("n")){
            System.out.println("Não informado.");
        }else {
            System.out.println("Sexo Inválido.");
        }
    }
}
