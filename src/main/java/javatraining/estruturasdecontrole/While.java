package javatraining.estruturasdecontrole;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.println("Informe sua idade");
        Scanner entrada = new Scanner(System.in);

        int idade = entrada.nextInt();

        while (idade < 18){
            System.out.println("Menor de idade");
            idade++;
        }
    }
}
