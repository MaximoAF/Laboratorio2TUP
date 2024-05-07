package Trabajos_en_clase.Polimorfismo.Universal.Herencia;

public class Auto extends Vehiculo{
    String matricula;

    @Override
    void showMessage() {
        System.out.println("Llamando metodo de auto");
    }
}
