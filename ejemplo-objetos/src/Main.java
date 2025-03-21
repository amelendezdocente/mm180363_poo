import Animals.Animal;
import Animals.Tiger;
import Animals.Vengala;
import Animals.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal animal = new Animal();
        Tiger tiger = new Tiger();
        Vengala vengala = new Vengala();

        zoo.sayHello(animal);
        zoo.sayHello(tiger);
        zoo.sayHello(vengala);
    }
}