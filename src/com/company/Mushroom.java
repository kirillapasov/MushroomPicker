package com.company;

public class Mushroom {
    private String mushroomname;
    private String color;
    private  Boolean poison;

    public String getMushroomname() {
        return mushroomname;
    }
    public void setMushroomname(String mushroomname) {

        this.mushroomname = mushroomname;
    }




    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Mushroom(String mushroomname, String color){
        this.mushroomname = mushroomname;
        this.color = color;
    }

    public Boolean getPoison() {
        return poison;
    }

    public void setPoison(Boolean poison) {
        this.poison = poison;
    }
}
