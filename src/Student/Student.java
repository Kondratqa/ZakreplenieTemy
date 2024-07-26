package Student;

public class Student {
    private String name;
    private int age;
    private int[] grades;

    public Student(String name, int age, int[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }

    public String getInfo() {
        return "Студент: " + name + ", Возраст: " + age;

    }
}
