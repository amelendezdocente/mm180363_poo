package G05L;

import G05L.Objects.Cat;
import G05L.Objects.Farm;
import G05L.Objects.Sheep;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        Cat cat = Cat.createCat();
        Collection<Cat> Cats = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            cat.setName("gato" + i);
            cat.setColor("calicos");
            cat.setAge(i);
            Cats.add(cat);
        }

        Sheep sheep = Sheep.createSheep("lana", "blanco", 6);
        Sheep sheep2 = Sheep.createSheep("lanudo", "cafe", 8);

        Collection<Sheep> Sheeps = new ArrayList<>();
        Sheeps.add(sheep);
        Sheeps.add(sheep2);

        farm.setCats(Cats);
        farm.setSheeps(Sheeps);

        System.out.println(farm.getTotalAnimals());
    }
}