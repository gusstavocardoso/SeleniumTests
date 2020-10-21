package training.poo;

public class Pessoa {
    // Atributos
    String nome;
    String sobrenome;
    Integer idade;

    // Método construtor
    public Pessoa(String nome, String sobrenome, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    // Método sem parâmetro
    public void falar(){
        System.out.println("O " + nome + " está falando");
    }

    // Método com parâmetro
    public void comentar(String comentario){
        System.out.println(comentario);
    }

    // Método com retorno


    // Método estático
    public static void anoNascimento(Integer ano){
        System.out.println("Nasci no ano de " + ano);
    }




}
