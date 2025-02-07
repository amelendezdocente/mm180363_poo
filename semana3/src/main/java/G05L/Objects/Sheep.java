package G05L.Objects;

public class Sheep {
    private Sheep(String name, String color, int age) {
    }

    public static Sheep createSheep(String name, String color, int age) {
        return new Sheep(name, color, age);
    }
}
