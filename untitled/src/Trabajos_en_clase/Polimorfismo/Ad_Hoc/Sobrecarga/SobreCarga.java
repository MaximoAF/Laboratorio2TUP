package Trabajos_en_clase.Polimorfismo.Ad_Hoc.Sobrecarga;

public class SobreCarga {
    public void test(){
        System.out.println("No hay parametros");
    }
    public void test(String name){
        System.out.println("Solo se etrego el nombre: " +name);
    }
    public void test(String name, int age){
        System.out.println("Nombre: " +name + " y edad: "+age);
    }
    public void test(int age){
        System.out.println("Solo se etrego la edad: " +age);
    }
}
