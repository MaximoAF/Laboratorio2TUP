package Trabajos_Practicos.TP_Exepciones.Parte_B;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws DueTuitionException, MyException {
        // Creamos objetos de las clases
        Truk truk1 = new Truk(120,"t2000");
        Driver driver1 = new Driver("Mario Julio");

        Tuition tuitionDue = new Tuition(1234, LocalDate.of(2022, 4, 8));
        Tuition tuitionActual = new Tuition(1534, LocalDate.of(2026, 4, 8));

        //driver1.insertTuition(tuitionDue);
        //driver1.insertTuition(tuitionActual);
        //truk1.setDriver(driver1);
        //truk1.speedUp();

    }
}
