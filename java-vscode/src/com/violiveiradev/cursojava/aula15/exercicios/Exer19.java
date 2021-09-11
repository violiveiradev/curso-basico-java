package com.violiveiradev.cursojava.aula15.exercicios;
import java.util.Scanner;

public class Exer19 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();
        
        System.out.println("Digite a operação (+ - / *): ");
        String operacao = scan.next();
        
        double resultado = 0;
        boolean valida = true;
        
        switch(operacao){
            case "+": resultado = num1 + num2; break; 
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            default: 
                System.out.println("Operação inválida"); 
                valida = false;
        }
        
        if (valida){
            
            System.out.println("Resultado: " + resultado);
            
            if (resultado >=0){
                System.out.println("resultado positivo");
            } else {
                System.out.println("resultado negativo");
            }
            
            if (resultado % 2 == 0){
                System.out.println("Resultado par");
            }else {
                System.out.println("Resultado ímpar");
            }
        }
    }
}
