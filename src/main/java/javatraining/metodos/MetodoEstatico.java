package javatraining.metodos;

import java.util.Calendar;
import java.util.Scanner;

public class MetodoEstatico {
    public static void main(String[] args) {
        Estatico.calcularIdade();
    }

    static class Estatico{
        public static void calcularIdade(){
            Calendar anoAtual = Calendar.getInstance();

            System.out.println("Informe o ano que nasceu");

            Scanner entrada = new Scanner(System.in);

            int anoNascimento = entrada.nextInt();

            int idade = anoAtual.get(Calendar.YEAR) - (anoNascimento);

            System.out.println("Sua idade é: " + idade);

            if (idade >= 18){
                System.out.println("Maior de idade");
            }
            else {
                System.out.println("Menor de idade");
            }
        }
    }
}
