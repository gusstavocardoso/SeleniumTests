package javatraining.metodos;

public class MetodoComRetorno {
    public static void main(String[] args) {
        System.out.println(Retorno.soma(10,10));
        System.out.println(Retorno.nomeCompleto("Yngwie", " Malmsteen"));
    }

    static class Retorno {
        public static int soma(int numA, int numB) {
            return numA + numB;
        }

        public static String nomeCompleto(String nome, String sobreNome) {
            return nome + sobreNome;
        }

    }

}
