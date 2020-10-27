package javatraining.poo;

public class PessoaClasse {

    // Atributos
    public String nomeCompleto;
    public Integer idade;

    // Método construtor
    public PessoaClasse(String nomeCompleto, int idade) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
    }

    // Método sem parâmetro
    public void falar(){
        System.out.println("O " + nomeCompleto + " está falando");
    }

    // Método com parâmetro
    public void comentar(String comentario){
        System.out.println(comentario);
    }

    // Método com retorno
    public String dizerNome(String nome){
        return nome;
    }

    // Método estático
    public static void anoNascimento(Integer ano){
        System.out.println("Nasci no ano de " + ano);
    }
}
