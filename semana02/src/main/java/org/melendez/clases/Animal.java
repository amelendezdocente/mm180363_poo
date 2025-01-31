package org.melendez.clases;

public class Animal {
    private String name;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void greets(){}

    public String breath(){
        return "Esta respirando";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
