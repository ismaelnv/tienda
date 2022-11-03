package com.tienda.tienda.Entity;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.tienda.tienda.CategoriMapper;
import com.tienda.tienda.dominio.Produc;

import java.util.List;;

@Mapper(componentModel = "spring", uses = {CategoriMapper.class})
public interface ProducMapper {
    
    @Mappings({
        @Mapping(source = "productoId", target = "productId" ),
        @Mapping(source = "nombre", target = "name" ),
        @Mapping(source = "categoriaId", target = "categoryId" ),
        @Mapping(source = "precioVenta", target = "PVenta" ),
        @Mapping(source = "antidadStock", target = "stock" ),
        @Mapping(source = "estado", target = "activo" ),
    })

    Produc toProduc(Producto producto);
    List<Produc> toProduc(List<Producto>productos);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "precioVenta", ignore = true),
        @Mapping(target = "categoria", ignore = true),
        @Mapping(target = "prasProductos", ignore = true),
    })

    Producto toProducto(Produc produc); 



    
}
