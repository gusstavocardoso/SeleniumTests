package javatraining.estruturasdedecisao;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Informe a sua idade");
        Scanner entrada = new Scanner(System.in);

        Integer idade  = entrada.nextInt();

        if(idade <= 18){
            System.out.println("Menor de idade");
        }
        else{
            System.out.println("Maior de idade");
        }
    }
}
