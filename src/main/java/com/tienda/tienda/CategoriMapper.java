package com.tienda.tienda;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.tienda.tienda.Entity.Categoria;
import com.tienda.tienda.dominio.Categori;

@Mapper(componentModel = "spring")
public interface CategoriMapper {

    @Mappings({
        @Mapping(source = "id" ,target = "categoryId"),
        @Mapping(source = "descripcion" ,target = "category"),
        @Mapping(source = "estado" ,target = "active"),
    })

    Categori tuCategori(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)

    Categoria toCategoria(Categori categori);

    
}
