package DOGS;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Бобик", "Лабрадор", 3);
        myDog.bark();
        System.out.println(myDog.getInfo());
    }
}
