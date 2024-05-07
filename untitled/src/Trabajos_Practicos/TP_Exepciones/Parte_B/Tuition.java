package Trabajos_Practicos.TP_Exepciones.Parte_B;

import java.time.LocalDate;

public class Tuition {
    private int number;
    private LocalDate dueDate;

    public Tuition(int number, LocalDate dueDate) {
        this.number = number;
        this.dueDate = dueDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
