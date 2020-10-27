package javatraining.poo;

public class ModificadorPrivate {
        private long cpf = 12345678910L;
        private int rg = 1234567890;

        private String nomeCompelo(String nomeCompleto) {
            return nomeCompleto;
        }

        private void meuCPF(){
            System.out.println(cpf);
        }
         private void meuRG(){
             System.out.println(rg);
         }

    public static void main(String[] args) {
        ModificadorPrivate modificarPrivado = new ModificadorPrivate();
        modificarPrivado.meuCPF();
        modificarPrivado.meuRG();
        System.out.println(modificarPrivado.nomeCompelo("Yngwie Malmsteen"));
    }
}
