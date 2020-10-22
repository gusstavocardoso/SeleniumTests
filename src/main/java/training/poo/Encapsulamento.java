package training.poo;

public class Encapsulamento {
    private int anoNascimeto;
    private long cpf;
    private int conta;

    // Método construtor com parâmentro
    public Encapsulamento(int anoNascimeto, long cpf) {
        this.anoNascimeto = anoNascimeto;
        this.cpf = cpf;
    }

    public int getAnoNascimeto() {
        return anoNascimeto;
    }

    public void setAnoNascimeto(int anoNascimeto) {
        this.anoNascimeto = anoNascimeto;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
}
