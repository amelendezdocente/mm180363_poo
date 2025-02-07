package G05L.Objects;

import java.util.Collection;

public class Farm {
    private Collection<Cat> cats;
    private Collection<Sheep> sheeps;

    public Collection<Cat> getCats() {
        return cats;
    }

    public void setCats(Collection<Cat> cats) {
        this.cats = cats;
    }

    public Collection<Sheep> getSheeps() {
        return sheeps;
    }

    public void setSheeps(Collection<Sheep> sheeps) {
        this.sheeps = sheeps;
    }

    public String getTotalAnimals(){
        int totalCats = getCats().size();
        int totalSheeps = getSheeps().size();
        boolean isCatAdult = false;

        for(Cat cat: getCats()){
            isCatAdult = cat.getAge() == 7;
        }

        return "Hay un total de: " + (totalSheeps + totalCats)
                + (isCatAdult ? " y hay un gato mayor de edad" : "");
    }
}
