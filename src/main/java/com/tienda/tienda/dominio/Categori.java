package com.tienda.tienda.dominio;

public class Categori {

    private Integer categoryId;
    private String category;
    private Boolean active;
     
    public Integer getCategoryId(){
        return this.categoryId;
    }

    public String getCategory(){
        return this.category;
    }
    
    public Boolean getActive(){
        return this.active;
    }

    public void setCategoryId(Integer categoryId){
        this.categoryId = categoryId;
    }

    public void setCategory(String category){
        this.category = category;
    }
    
    public  void setActive(Boolean active){
        this.active = active;
    }

    
    
}
