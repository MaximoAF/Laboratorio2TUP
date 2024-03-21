package Practico_UML.Ejercicio_1;

public class Avion {
    private String tuition;
    private String model;
    private int capacity;

    public Avion(String tuition, String model, int capacity) {
        this.tuition = tuition;
        this.model = model;
        this.capacity = capacity;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
