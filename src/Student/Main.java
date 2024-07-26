package Student;

public class Main {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 37, 53};
        Student student = new Student("Алексей", 20, grades);
        System.out.println("Средний балл: " + student.calculateAverage());
        System.out.println(student.getInfo());
    }
}
