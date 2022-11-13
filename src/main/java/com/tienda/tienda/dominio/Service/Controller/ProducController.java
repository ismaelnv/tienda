package com.tienda.tienda.dominio.Service.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.tienda.dominio.Produc;
import com.tienda.tienda.dominio.Service.ProducServicio;

@RestController
@RequestMapping("/produc")
public class ProducController {

    @Autowired
    ProducServicio producServicio;
    
    @GetMapping()
    public List<Produc> getAll(){
        return this.producServicio.getAll();
    }
    
    @GetMapping("/{id]")
    public Optional<Produc> getProducId(@PathVariable("id") Integer productId){
        return this.producServicio.getProducId(productId);
    }

    @GetMapping("/category/{categoryId}")
    public Optional<List<Produc>> getByCategoria(@PathVariable("categoryId")Integer CategoryId){
        return this.producServicio.getByCategoria(CategoryId);
    }
    
    @PostMapping("/save")
    public Produc save(@RequestBody Produc produc){
        return this.producServicio.save(produc);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable("id") Integer producId){
        return this.producServicio.delete(producId);
    }
    
}
