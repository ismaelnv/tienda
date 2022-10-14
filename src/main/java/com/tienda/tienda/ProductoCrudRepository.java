package com.tienda.tienda;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.tienda.tienda.Entity.Producto;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{

    List<Producto> finByIdCtegoriaOrderByNombreAsc(int categoriaId);// Para bucar por id y ordenar de menor a mayor
    Optional<List <Producto>> finByCantidadStocklessThanAndEstado(Integer catidadStock);//Para buscar los productos que ya  se terminaran
}
