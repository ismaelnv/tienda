package com.tienda.tienda.dominio;

public class Produc {
    
    private Integer productId;
    private String name;
    private Integer categoryId;
    private Double PVenta;
    private Integer stock;
    private Boolean activo;
    
    public Integer getProductId(){
        return this.productId;
    }
    
    public String getName(){
        return this.name;
    }

    public Integer getCategoryId(){
        return this.categoryId;
    }

    public Double getPVenta(){
        return this.PVenta;
    }

    public Integer getStock(){
        return this.stock;
    }

    public Boolean getActivo(){
        return this.activo;
    }

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setCategoryId(Integer categoryId){
        this.categoryId = categoryId;
    }

    public void setPVenta(Double PVenta){
        this.PVenta = PVenta;
    }

    public void setStock(Integer stock){
        this.stock = stock;
    }

    public void setActivo(Boolean activo){
        this.activo = activo;
    }
        
    
}
