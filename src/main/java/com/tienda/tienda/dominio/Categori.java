package com.tienda.tienda.dominio;

public class Categori {

    private Integer categoryId;
    private String category;
    private Boolean estado;
     
    public Integer getCategoryId(){
        return this.categoryId;
    }

    public String getCategory(){
        return this.category;
    }
    
    public Boolean getEstado(){
        return this.estado;
    }

    public void setCategoryId(Integer categoryId){
        this.categoryId = categoryId;
    }

    public void setCategory(String category){
        this.category = category;
    }
    
    public  void setEstado(Boolean estado){
        this.estado = estado;
    }

    
    
}
