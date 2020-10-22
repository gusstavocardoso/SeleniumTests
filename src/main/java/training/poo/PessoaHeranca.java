package training.poo;

public class PessoaHeranca extends PessoaClasse {
    public double altura;
    public double peso;

    public PessoaHeranca(String nomeCompleto, int idade, double altura, double peso) {
        super(nomeCompleto, idade);
        this.altura = altura;
        this.peso = peso;
    }

    public double informarPeso(double peso){
        return peso;
    }
    public double informarAltura(double altura){
        return altura;
    }
}
