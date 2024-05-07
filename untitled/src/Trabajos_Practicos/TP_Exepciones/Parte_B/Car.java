package Trabajos_Practicos.TP_Exepciones.Parte_B;

public class Car extends Vehicle{
    private String model;
    public Car(int velocity, String model) {
        super(velocity);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
