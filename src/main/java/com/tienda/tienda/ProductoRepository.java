package com.tienda.tienda;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tienda.tienda.Entity.Producto;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getProductos(){ 
     return (List<Producto>) productoCrudRepository.findAll();//Traera todo los productos 
    }

    public List<Producto> getIdCategoriaYProducto(Integer categoriaId){
        return productoCrudRepository.finByIdCtegoriaOrderByNombreAsc(categoriaId);
    }

    public Optional<List<Producto>> getEscasos(Integer cantidad){
        return productoCrudRepository.finByCantidadStocklessThanAndEstado(cantidad);//Buscara productos escasos
    }

    public Optional<Producto> getProductoId( Integer productoId){
        return productoCrudRepository.findById(productoId);//buscara el productor por el id
    }

    public Producto agregarProducto(Producto producto){
        return productoCrudRepository.save(producto);//Para agregar un producto ala base de datos
    }
    
    public void eliminarProductoU( Integer productoId){
        productoCrudRepository.deleteById(productoId);//Para eliminar productos 
    }
  
    
}
