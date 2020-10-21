package training.poo;

public class Main {
    public static void main(String[] args) {
        Pessoa humano = new Pessoa("John", "Petrucci", 40);
        System.out.println(humano.idade + " anos");
        humano.falar();
        humano.comentar(humano.nome + " está comentado");
        System.out.println(humano.dizerNome("Gustavo"));

        Pessoa.anoNascimento(1986);
    }
}
