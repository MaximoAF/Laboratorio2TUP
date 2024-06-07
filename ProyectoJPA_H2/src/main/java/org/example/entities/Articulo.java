package org.example.entities;

import javax.persistence.*;

@Entity
public class Articulo {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "precio_venta")
    private Double precioVenta;

    @OneToOne(mappedBy = "articulo")
    private ImagenArticulo imagenArticulo;

    @ManyToOne
    @JoinColumn(name = "unidad_medida_id")
    private UnidadMedida unidadMedida;

    //Contructor
    public Articulo(){}

    public Articulo(Long id, String denominacion, Double precioVenta, ImagenArticulo imagenArticulo, UnidadMedida unidadMedida) {
        this.id = id;
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.imagenArticulo = imagenArticulo;
        this.unidadMedida = unidadMedida;
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public ImagenArticulo getImagenArticulo() {
        return imagenArticulo;
    }

    public void setImagenArticulo(ImagenArticulo imagenArticulo) {
        this.imagenArticulo = imagenArticulo;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}