package com.tienda.tienda.dominio.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.tienda.tienda.dominio.Produc;
import com.tienda.tienda.dominio.ProducRepository;

@Service
public class ProducServicio {
    
    @Autowired
    private ProducRepository producRepository;

    public List<Produc> getAll(){
        return producRepository.getAll();
    }

    public Optional<Produc> getProducId(Integer productId){
        return producRepository.getProducId(productId);
    }

    public Optional<List<Produc>> getByCategoria(Integer categoryId){
        return producRepository.getByCategori(categoryId);
    }
    
    public Produc save(Produc produc){
        return producRepository.save(produc);
    }
    
    public Boolean delete(Integer producId){
        if(getProducId(producId).isPresent()){
            producRepository.delete(producId);
            return true;
        }else{
            return false;
        }
    }
}
