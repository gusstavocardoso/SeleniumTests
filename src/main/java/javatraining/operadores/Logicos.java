package javatraining.operadores;

public class Logicos {
    public static void main(String[] args) {
        // Operador E
        int x = 5;
        boolean boolX = (x > 6 && x < 10);
        System.out.println(x > 3 && x < 10);
        System.out.println(boolX);

        // Operador OU
        int y = 5;
        boolean boolY = (y > 6 || y < 4);
        System.out.println(y > 3 || y < 4);
        System.out.println(boolY);

        // Operador NÃO
        int z = 5;
        boolean boolZ = (!(z > 3 && z < 10));
        System.out.println(!(z > 6 && z < 10));
        System.out.println(boolZ);
    }
}
