package com.tienda.tienda.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ComprasProductoPk implements Serializable {
    
    @Column(name =  "id_compra")
    private  Integer idCompra;

    @Column(name = "id_producto")
    private  Integer  idProducto;    

    public Integer getIdCompra(){
        return this.idCompra;
    }
    public Integer getIdProducto(){
        return this.idProducto;
    }
     
    public void setIdCompra(Integer idCompra){
        this.idCompra = idCompra;
    }

    public void setIdProducto(Integer idProducto){
        this.idProducto = idProducto;
    }
        
    

}
