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
@Table(name = "compras")
public class Compra {
    
    @Id
    @Column(name = "compras_id")
    private Integer comprasId;

    @Column(name = "cliente_id")
    private Integer clienteId;

    @Column(name = "medio_pago")
    private String medioPago;
    private String comentario;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "cliente_id",insertable = false,updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compras")
    List <ComprasProducto> comprasProductos;

    public Integer getComprasId(){
        return this.comprasId;
    }

    public Integer getClienteId(){
        return this.clienteId;
    }

    public String getMedioPago(){
        return this.medioPago;
    }

    public String getComentario(){
        return this.comentario;
    }

    public String getEStado(){
        return this.estado;
    }

    public void setComprasId(Integer comprasId){
        this.comprasId= comprasId;
    }

    public void setClienteId(Integer clienteId){
        this.clienteId = clienteId;
    }

    public void setMedioPago(String medioPago){
        this.medioPago = medioPago;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }


    
}
