package Trabajos_Practicos.TP_Exepciones.Parte_B;

public class Truk extends Vehicle{
    private String model;
    private Driver driver;

    public Truk(int velocity, String model) {
        super(velocity);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
