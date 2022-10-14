package com.tienda.tienda.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @Column( name = "cliente_id")
    private Integer clienteId;
    private String nombre;

    @Column(name = "apellidos")
    private String apellido;
    private Double celular;
    private String direccion;
    private String email;
    
    @OneToMany(mappedBy = "cliente")
    private List<Compra> cliente;
    
    public Integer getClienteId(){
        return this.clienteId;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public Double getCelular(){
        return this.celular;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public String getEmail(){
        return this.email;
    }

    public void setClienteId(Integer clienteId){
        this.clienteId = clienteId;
    }

    public void setNombreI(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setCelular(Double celular){
        this.celular = celular;
    }

    public void setDirrecion(String direccion){
        this.direccion = direccion;
    }

    public void setEmail(String email){
        this.email = email;
    }
}

