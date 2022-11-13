package com.tienda.tienda;

import com.tienda.tienda.Entity.Producto;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{

    List<Producto> finByIdCtegoriaOrderByNombreAsc(int categoriaId);// Para bucar por id y ordenar de menor a mayor
    Optional<List <Producto>> finByCantidadStocklessThanAndEstado(Integer catidadStock);//Para buscar los productos que ya  se terminaran
    
    
    
}
