package org.melendez;

import org.melendez.clases.Car;
import org.melendez.clases.Cat;

public class Main {
    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 12;
        int sum = num1 + num2;
        int sum2 = Integer.sum(num1, num2);

        Cat felino1 = Cat.createCat("nala", "calico");
        Cat felino2 = Cat.createCat("latte", "bicolor");
        Cat felino = Cat.createCat();
        felino1.getProperties();
        felino2.getProperties();
        felino.getProperties();
        felino.setName("mishi");
        felino.setColor("calico");

        System.out.println("Hello world!");
        System.out.println("Esta es la suma 1: " + sum);
        System.out.println("Esta es la suma 2: " + sum2);
        felino.getProperties();

        felino.setName("gato2");
        felino.setColor("naranja");
        felino.getProperties();

        System.out.println("Construyendo el vehiculo");
        Car miata = new Car();
        miata.setColor("rojo");
        miata.setModel("mazada miata");
        miata.setPlaca(1);
        miata.setGas(true);

        miata.getProperties();
    }
}