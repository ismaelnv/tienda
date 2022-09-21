package com.tienda.tienda.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Comparas_Productos")
public class ComprasProducto {
    
    @EmbeddedId
    private ComprasProductoPk id;

    private Integer cantidad;
    private Double total;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_compra")
    private Compra compras;

    @ManyToOne
    @JoinColumn(name = "id_producto")
   
    public Integer getCantidad(){
        return this.cantidad;
    }
    public Double getTotal(){
        return this.total;
    }
    public String getEstado(){
        return this.estado;
    }

    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }
    public void setTotal(Double total){
        this.total = total;
    }public void setEstado(String estado){
        this.estado = estado;
    }


     
    
}
