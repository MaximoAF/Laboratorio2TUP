package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Localidad {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    /*
    Bidireccional:

    @OneToMany(mappedBy = "localidad",orphanRemoval = true)
    private List<Domicilio> domicilios = new ArrayList<Domicilio>();

     */

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_provincia")
    private Provincia provincia;

    //Constructor
    public Localidad(){}

    public Localidad(Long id, String nombre, Provincia provincia) {
        this.id = id;
        this.nombre = nombre;
        this.provincia = provincia;
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

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
