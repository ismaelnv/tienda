package com.tienda.tienda;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tienda.tienda.Entity.ProducMapper;
import com.tienda.tienda.Entity.Producto;
import com.tienda.tienda.dominio.Produc;
import com.tienda.tienda.dominio.ProducRepository;

@Repository
public class ProductoRepository implements ProducRepository{
    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProducMapper mapper;
    
    @Override
    public List<Produc> getAll(){ 
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProduc(productos);//Traera todo los productos 
    }
    
    @Override
    public Optional<List<Produc>> getByCategori(Integer categoryId){
        List<Producto> productos = productoCrudRepository.finByIdCtegoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProduc(productos));
    }
    
    @Override
    public Optional<List<Produc>> getEscasosProduc(Integer stock){
        Optional<List<Producto>> productos = productoCrudRepository.finByCantidadStocklessThanAndEstado(stock);//Buscara productos escasos
        return productos.map(prods -> mapper.toProduc(prods));
    }
    
    @Override
    public Optional<Produc> getProducId( Integer productId){
        return productoCrudRepository.findById(productId).map(producto -> mapper.toProduc(producto)); //buscara el productor por el id
        
    }
    
    @Override
    public Produc save(Produc produc){
        Producto producto = mapper.toProducto(produc);
        return mapper.toProduc(productoCrudRepository.save(producto));//Para agregar un producto ala base de datos
    }
    
    @Override
    public void  delete( Integer productId){
        productoCrudRepository.deleteById(productId);//Para eliminar productos 
    }
  
    
}
