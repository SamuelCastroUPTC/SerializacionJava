package models;

import java.io.Serializable;

public class City implements Serializable{
    
    private String name;
    private int poblation;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPoblation() {
        return poblation;
    }
    public void setPoblation(int poblation) {
        this.poblation = poblation;
    }


}
