public class Country {
    private String name;
    private int population;
    private int area;
    private String nameCapital;
    private String accessSea;

    public Country(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setAccessSea(String accessSea) {
        this.accessSea = accessSea;
    }

    public String getAccessSea() {
        return accessSea;
    }
}
