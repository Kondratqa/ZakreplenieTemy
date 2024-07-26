package OOP;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog("Chrly");
        lab.setLapa(4);
        lab.setHvost(1);
        lab.setGlaza(2);
        lab.setName("Charly");
        lab.setPoroda("Labrador");


        Dog shepherd = new Dog("Make");
        shepherd.setLapa(4);
        shepherd.setHvost(1);
        shepherd.setGlaza(2);
        shepherd.setName("Mike");
        shepherd.setPoroda("Shepherd");


        System.out.println("Порода моей собаки " + lab.getPoroda() + " по кличке " + lab.getName() + " у него " + lab.getGlaza() + " глаза " + lab.getLapa() + " лапы и " + lab.getHvost() + " хвост ");
        System.out.println("Порода моей собаки " + shepherd.getPoroda() + " по кличке " + shepherd.getName() + " у неё " + shepherd.getGlaza() + " глаза " + shepherd.getLapa()  + " лапы и " + shepherd.getHvost() + " хвост " );

    }
}

