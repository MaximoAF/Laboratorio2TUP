package Trabajos_en_clase.Polimorfismo.Ad_Hoc.Coercion;

public class Main {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 5;

        Resta resta = new Resta();
        System.out.println("La resta de "+a+" - "+b+" = "+resta.restar(a,b));

    }
}
