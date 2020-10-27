package javatraining.estruturasdecontrole;

public class Foreach {
    public static void main(String[] args) {
        String[] guitarristas = {"John Petrucci", "Steve Vai", "Vinnie Moore"};

        for (String guitarrista: guitarristas) {
            System.out.println(guitarrista);
        }
    }
}
