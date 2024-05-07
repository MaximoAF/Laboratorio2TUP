package Trabajos_Practicos.TP_Exepciones.Parte_B;

import java.time.LocalDate;

public class Driver {
    private Tuition tuition;
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void insertTuition(Tuition tuition) throws DueTuitionException {
        if (tuition.getDueDate().isBefore(LocalDate.now())) {
            throw new DueTuitionException("La matricula del vehículo está vencida.");
        } else {
            this.tuition = tuition;
        }
    }
}
