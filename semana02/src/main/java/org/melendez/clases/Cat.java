package org.melendez.clases;

public class Cat extends Animal{
    private Cat(String name, String color) {
        this.setName(name);
        this.setColor(color);
    }

    private Cat(){
    }

    public static Cat createCat(String name, String color) {
        return new Cat(name, color);
    }

    public static Cat createCat(){
        return new Cat();
    }

    @Override
    public void greets() {
        super.greets();
    }

    public void getProperties(){
        System.out.println(
                "Este es el nombre del gato: " + this.getName()
                        + " y el color es: " + this.getColor()
        );
    }
}
