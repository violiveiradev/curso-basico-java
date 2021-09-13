package com.violiveiradev.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exer02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean senhaValida = false;

        //boa pratica, criar variavel fora do loop.
        String nomeUser;
        String senhaUser;

        do {
            System.out.println("Digite o nome do usuario.");
            nomeUser = scan.next();
            System.out.println("Digite a senha do usuario.");
            senhaUser = scan.next();

            if (nomeUser.equalsIgnoreCase(senhaUser)){
                System.out.println("Digite uma senha diferente.");
            } else {
                senhaValida = true;
                System.out.println("Usuario e senha registrada.");
            }

        } while (!senhaValida);
    }
}