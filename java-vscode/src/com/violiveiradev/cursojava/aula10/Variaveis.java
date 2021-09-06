package com.violiveiradev.cursojava.aula10;

public class Variaveis {
    public static void main(String[] args) {
        
        //convenção Java
        int idade = 20;
        String nome = "Vinicius";
        String nomeDoMeuCachorro = "Thor";
        String ano2021 = "2021";

        //aceito, mas não utilizado
        int _idade;
        int $idade;

        //não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 32;

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

        // má pratica
        int a = 10;
        String b = "Vinicius";

    }
}
