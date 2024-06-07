package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Pais {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

      /*

    @OneToMany(mappedBy = "pais",orphanRemoval = true)
    private List<Provincia>provincias = new ArrayList<Provincia>();

     */

    //Constructor
    public Pais(){}

    public Pais(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Getter y Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
