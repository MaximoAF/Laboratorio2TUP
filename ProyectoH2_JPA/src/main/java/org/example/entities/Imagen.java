package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "imagen")
public class Imagen extends Base{

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "denominacion")
    private String denominacion;

    //Constructor
    public Imagen(){}

    public Imagen(Long id, String denominacion) {
        this.id = id;
        this.denominacion = denominacion;
    }

    public Imagen(Long id, Long id1, String denominacion) {
        super(id);
        this.id = id1;
        this.denominacion = denominacion;
    }

    //Getter y Setter

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
