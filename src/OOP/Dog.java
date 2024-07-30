package OOP;

public class Dog {
    private int lapa;
    private int hvost;
    private String name;
    private String poroda;
    private int glaza;



    public Dog(String name) {
        this.name = name;
    }

    public int getHvost() {
        return hvost;
    }

    public void setHvost(int hvost) {
        this.hvost = hvost;
    }

    public int getLapa() {
        return lapa;
    }

    public void setLapa(int lapa) {
        this.lapa = lapa;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void setName(String dogsName) {
        this.name = name;
    }

    public int getGlaza() {
        return glaza;
    }

    public void setGlaza(int glaza) {
        this.glaza = glaza;
    }
}
