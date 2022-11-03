package com.tienda.tienda.dominio;

import java.util.List;
import java.util.Optional;

public interface ProducRepository{

    List<Produc> getAll();
    Optional< List<Produc>> getByCategori(Integer categoryId);
    Optional<List<Produc>> getEscasosProduc(Integer quentyti );
    Optional<Produc> getProducId(Integer ProductId);
    Produc save(Produc produc);
    void delete(Integer ProductId);


}