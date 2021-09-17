package com.violiveiradev.cursojava.aula17.exercicios;

public class Exer09 {

    public static void main(String[] args) {
        
       /* int impar = 0;
        int par = 0;
        int count = 0;

        for (int i = 0; i < 50; i++ ){
            
            count = i % 2;

            if ( count == 0 ){
                par = i;
                //System.out.print(par);
            } else {
                impar = i;
                System.out.print(impar + " ");
            }
        }*/

        for (int i = 0; i < 50; i++ ){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
    
}
