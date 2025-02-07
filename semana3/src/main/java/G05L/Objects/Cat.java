package G05L.Objects;

public class Cat extends Animal{
    private String raza;

    public Cat(){

    }

    private Cat(String name, String color, int age) {
    }

    public static Cat createCat(){
        return new Cat();
    }

    public static Cat createCat(String name, String color, int age) {
        return new Cat(name, color, age);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
