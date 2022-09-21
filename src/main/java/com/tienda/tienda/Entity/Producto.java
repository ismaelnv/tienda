package com.tienda.tienda.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {
    
    @Id
    @Column(name = "producto_id")
    private Integer productoId;
    private String nombre;

    @Column(name = "categoria_id")
    private Integer categoriaId;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;
    private Float estado;
    
    @ManyToOne
    @JoinColumn(name = "categoria_id" , insertable = false , updatable = false)
    private Categoria categoria;

    @OneToMany(mappedBy = "productos")
    private List<ComprasProducto> comprasProductos;

    public Integer getProductoId(){
        return this.productoId;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Integer getCategoriaId(){
        return this.categoriaId;
    }

    public String getCodigoBarras(){
        return this.codigoBarras;
    }

    public Double getPrecioVenta(){
        return this.precioVenta;
    }

    public Integer getCantidadStock(){
        return this.cantidadStock;
    }

    public Float getEstado(){
        return this.estado;
    }

    public void setProductoId(Integer productoId){
        this.productoId = productoId;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCategoriaId(Integer categoriaId){
        this.categoriaId = categoriaId;
    }

    public void setCodigoBarras(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }

    public void setPrecioVenta(Double precioVenta){
        this.precioVenta = precioVenta;
    }

    public void setCantidadStock(Integer cantidadStock){
        this.cantidadStock = cantidadStock;
    }

    public void setEstado(Float estado){
        this.estado = estado;
    }

    
}
