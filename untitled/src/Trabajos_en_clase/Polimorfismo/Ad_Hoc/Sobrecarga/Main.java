package Trabajos_en_clase.Polimorfismo.Ad_Hoc.Sobrecarga;

public class Main {
    public static void main(String[] args) {
        SobreCarga sobreCarga = new SobreCarga();

        sobreCarga.test();
        sobreCarga.test("Maximo");
        sobreCarga.test(19);
        sobreCarga.test("Maximo",19);
    }
}
