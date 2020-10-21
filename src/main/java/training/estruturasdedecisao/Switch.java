package training.estruturasdedecisao;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        int mes;
        System.out.println("Informe o número que corresponde a um mês");
        Scanner entrada = new Scanner(System.in);
        mes =entrada.nextInt();

        switch(mes){
            case 1:
                System.out.println("O mês é Janeiro");
                break;
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            default:
                System.out.println("Número não corresponde");
        }
    }
}
