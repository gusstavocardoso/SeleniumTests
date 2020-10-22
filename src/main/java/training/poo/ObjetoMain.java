package training.poo;

public class ObjetoMain {
    public static void main(String[] args) {
        // Instâncias da clase Pessoa
        PessoaClasse humano = new PessoaClasse("John Petrucci",  40);
        System.out.println(humano.idade + " anos");
        humano.falar();
        humano.comentar(humano.nomeCompleto + " está comentado");
        System.out.println(humano.dizerNome("Meu nome"));

        // Método estático da classe Pessoa
        PessoaClasse.anoNascimento(1986);

        // Instâncias da classe de Herança
        PessoaHeranca pessoaHeranca = new PessoaHeranca("John Wick", 43,1.73,89.00);
        System.out.println(pessoaHeranca.altura);
        System.out.println(pessoaHeranca.informarPeso(pessoaHeranca.peso));
        System.out.println(pessoaHeranca.informarAltura(pessoaHeranca.altura));

        // Instâncias da classe Encapsulamento
        Encapsulamento protegido = new Encapsulamento(1986, 12345678910L);
        System.out.println(protegido.getCpf());
        System.out.println(protegido.getAnoNascimeto());

        // Método Set
        protegido.setAnoNascimeto(1970);
        protegido.setCpf(64144772810L);
        // Set atributo sem construtor
        protegido.setConta(145478);

        // Método Get
        System.out.println(protegido.getAnoNascimeto());
        System.out.println(protegido.getCpf());
        // Get atributo sem construtor
        System.out.println(protegido.getConta());



    }
}
