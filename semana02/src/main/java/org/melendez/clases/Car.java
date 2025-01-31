package org.melendez.clases;

public class Car {
    private String model;
    private String color;
    private int placa;
    private Boolean isGas; //si es 1 es de gasolina, si es 0 es disiel


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public Boolean getGas() {
        return isGas;
    }

    public void setGas(Boolean gas) {
        isGas = gas;
    }

    public String isGasoline(){
        if(isGas){
            return "Es un carro a gasolina";
        } else {
            return "Es un carro a disiel";
        }
    }

    public void getProperties(){
        System.out.println("El carro es un: " + this.model
                + " de color: " + this.color
                + " con placa: " + this.placa
                + " y " + isGasoline());
    }
}
