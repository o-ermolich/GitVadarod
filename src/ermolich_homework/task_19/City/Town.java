package ermolich_homework.task_19.City;

public class Town {
    private int id;
    private String name;
    private int countPeople;
    private continent continent;

    public enum continent {
        Евразия, Африка, Северная_Америка, Южная_Америка, Австралия, Антарктида
    }

    public Town(int id, String name, int countPeople, continent continent) {
        this.id = id;
        this.name = name;
        this.countPeople = countPeople;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public continent getContinent() {
        return continent;
    }

    public void setContinent(continent continent) {
        this.continent = continent;
    }
}
