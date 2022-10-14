package com.tienda.tienda.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {
    
    @Id
    @Column(name = "categoria_id")
    private Integer id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> categoria;


    public Integer getId(){
        return this.id;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public Boolean getEstado(){
        return this.estado;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setDescripcion(Boolean estado){
        this.estado = estado;
    }

    
}
