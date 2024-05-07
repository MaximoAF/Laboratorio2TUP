package Trabajos_en_clase.Polimorfismo.Universal.Herencia;

public class Main {
    public static void main(String[] args) {
        // Down Casting
        Vehiculo vDC = new Auto();
        vDC.material = "Metal";

        Auto aDC = (Auto)vDC;
        aDC.matricula = "FTG-567";

        System.out.println(aDC.material);
        System.out.println(aDC.matricula);
        aDC.showMessage();

        // Up Casting
        Vehiculo vUC = (Vehiculo) new Auto();
        vUC.material = "Fibra de carbono";

        System.out.println(vUC.material);
        vUC.showMessage();

    }
}
