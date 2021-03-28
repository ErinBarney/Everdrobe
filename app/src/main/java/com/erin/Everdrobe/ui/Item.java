package com.erin.Everdrobe.ui;

public class Item {
    private String name;
    private String condition;
    private String imgURL;


    public Item (String name, String condition, String imgURL){
        this.name = name;
        this.condition = condition;
        this.imgURL = imgURL;

    }

    public String getName(){
        return name;
    }
    public void setName (String item){
        this.name = name;
    }

    public String getCondition(){
        return condition;
    }
    public void setCondition (String condition){
        this.condition = condition;
    }

    public String getImgURL(){
        return imgURL;
    }
    public void setImgURL (String imgURL){
        this.imgURL = imgURL;
    }
}
