package com.violiveiradev.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        boolean infovalida = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {

            System.out.println("Digite o nome: ");
            
            nome = scan.next();

            if (nome.length() >= 3){
                infovalida = true;
            } else { 
                System.out.println("Nome precisa no minimo 3 caracters.");
            }

        } while (!infovalida);

        infovalida = false;

        do {

            System.out.println("Digite o idade: ");
            
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150){
                infovalida = true;
            } else { 
                System.out.println("Idade precisa ser entre 0 e 150.");
            }

        } while (!infovalida);

        infovalida = false;

        do {

            System.out.println("Digite o salario: ");
            
            salario = scan.nextDouble();

            if (salario > 0){
                infovalida = true;
            } else { 
                System.out.println("Salario precisa ser maior que 0.");
            }

        } while (!infovalida);

        infovalida = false;

        do {

            System.out.println("Digite o sexo: ");
            
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infovalida = true;
            } else { 
                System.out.println("Sexo precisa ser 'F' ou 'M'.");
            }

        } while (!infovalida);

        infovalida = false;

        do {

            System.out.println("Digite o estado civil: ");
            
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                infovalida = true;
            } else { 
                System.out.println("O estado civil precisa ser 's', 'c', 'v', 'd'.");
            }

        } while (!infovalida);

        System.out.println("---------------------------");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(estadoCivil);
        System.out.println("---------------------------");
    }
}
