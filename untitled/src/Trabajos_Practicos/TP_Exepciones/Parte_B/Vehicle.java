package Trabajos_Practicos.TP_Exepciones.Parte_B;

public class Vehicle {
    private int velocity;

    public Vehicle(int velocity) {
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void speedUp() throws MyException{
        if(velocity == 120) {
            throw new MyException("No se puede superar las 120k/h");
        }else{
            velocity = velocity+1;
        }
    }
    public void curb() throws MyException{
        if(velocity > 110) {
            throw new MyException("No se puede decender mas la velocidad");
        }else{
            velocity = velocity-1;
        }
    }

}
