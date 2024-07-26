
\#\#\# Задача 1: Класс "Собака"

\*\*Шаг 1: Определение класса\*\*
```java
public class Dog {
    private String name;
    private String breed;
    private int age;
}
```
\- Мы создаем класс `Dog`\.
\- Определяем три приватных поля: `name`, `breed` и `age`\.

\*\*Шаг 2: Конструктор\*\*
```java
public Dog(String name, String breed, int age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
}
```
\- Создаем конструктор, который принимает три параметра и инициализирует поля\.

\*\*Шаг 3: Метод `bark()`\*\*
```java
public void bark() {
    System.out.println("Гав!");
}
```
\- Метод `bark()` выводит на экран звук, который издает собака\.

\*\*Шаг 4: Метод `getInfo()`\*\*
```java
public String getInfo() {
    return "Собака: " + name + ", Порода: " + breed + ", Возраст: " + age;
}
```
\- Метод `getInfo()` возвращает строку с информацией о собаке\.

\*\*Полный код класса `Dog`:\*\*
```java
public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("Гав!");
    }

    public String getInfo() {
        return "Собака: " + name + ", Порода: " + breed + ", Возраст: " + age;
    }
}
```

\#\#\# Задача 2: Класс "Студент"

\*\*Шаг 1: Определение класса\*\*
```java
public class Student {
    private String name;
    private int age;
    private int[] grades;
}
```
\- Создаем класс `Student` с полями `name`, `age` и массивом `grades`\.

\*\*Шаг 2: Конструктор\*\*
```java
public Student(String name, int age, int[] grades) {
    this.name = name;
    this.age = age;
    this.grades = grades;
}
```
\- Конструктор принимает имя, возраст и массив оценок\.

\*\*Шаг 3: Метод `calculateAverage()`\*\*
```java
public double calculateAverage() {
    int sum = 0;
    for (int grade : grades) {
        sum += grade;
    }
    return (double) sum / grades.length;
}
```
\- Метод вычисляет средний балл, суммируя все оценки и деля на их количество\.

\*\*Шаг 4: Метод `getInfo()`\*\*
```java
public String getInfo() {
    return "Студент: " + name + ", Возраст: " + age;
}
```
\- Метод возвращает информацию о студенте\.

\*\*Полный код класса `Student`:\*\*
```java
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
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public String getInfo() {
        return "Студент: " + name + ", Возраст: " + age;
    }
}
```

\#\#\# Задача 3: Класс "Круг"

\*\*Шаг 1: Определение класса\*\*
```java
public class Circle {
    private double radius;
}
```
\- Создаем класс `Circle` с полем `radius`\.

\*\*Шаг 2: Конструктор\*\*
```java
public Circle(double radius) {
    this.radius = radius;
}
```
\- Конструктор принимает радиус круга\.

\*\*Шаг 3: Метод `area()`\*\*
```java
public double area() {
    return Math.PI * radius * radius;
}
```
\- Метод вычисляет площадь круга по формуле \\\\\( \\\\pi r^2 \\\\\)\.

\*\*Шаг 4: Метод `circumference()`\*\*
```java
public double circumference() {
    return 2 * Math.PI * radius;
}
```
\- Метод вычисляет длину окружности по формуле \\\\\( 2\\\\pi r \\\\\)\.

\*\*Полный код класса `Circle`:\*\*
```java
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
```

\#\#\# Задача 4: Класс "Книга"

\*\*Шаг 1: Определение класса\*\*
```java
public class Book {
    private String title;
    private String author;

ChatGPT 4 | Midjourney | Claude | Suno, [26.07.2024 15:59]
private int year;
}
```
\- Создаем класс `Book` с полями `title`, `author` и `year`\.

\*\*Шаг 2: Конструктор\*\*
```java
public Book(String title, String author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
}
```
\- Конструктор принимает название книги, автора и год издания\.

\*\*Шаг 3: Метод `getBookInfo()`\*\*
```java
public String getBookInfo() {
    return "Книга: '" + title + "' Автор: " + author + ", Год издания: " + year;
}
```
\- Метод возвращает информацию о книге\.

\*\*Полный код класса `Book`:\*\*
```java
public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getBookInfo() {
        return "Книга: '" + title + "' Автор: " + author + ", Год издания: " + year;
    }
}
```

\#\#\# Задача 5: Класс "Автомобиль"

\*\*Шаг 1: Определение класса\*\*
```java
public class Car {
    private String make;
    private String model;
    private int year;
}
```
\- Создаем класс `Car` с полями `make`, `model` и `year`\.

\*\*Шаг 2: Конструктор\*\*
```java
public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
}
```
\- Конструктор принимает марку автомобиля, модель и год выпуска\.

\*\*Шаг 3: Метод `isVintage()`\*\*
```java
public boolean isVintage() {
    return (2023 - year) > 20; // Предполагаем, что текущий год — 2023.
}
```
\- Метод проверяет, является ли автомобиль винтажным \(старше 20 лет\)\.

\*\*Шаг 4: Метод `getCarInfo()`\*\*
```java
public String getCarInfo() {
    return "Автомобиль: " + make + " " + model + ", Год выпуска: " + year;
}
```
\- Метод возвращает информацию об автомобиле\.

\*\*Полный код класса `Car`:\*\*
```java
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public boolean isVintage() {
        return (2023 - year) > 20; // Предполагаем текущий год — 2023.
    }

    public String getCarInfo() {
        return "Автомобиль: " + make + " " + model + ", Год выпуска: " + year;
    }
}
```

\#\#\# Заключение

Теперь у вас есть полные реализации всех классов\. Вы можете использовать их в вашем основном методе или в тестах\. Например:

```java
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Бобик", "Лабрадор", 3);
        myDog.bark();
        System.out.println(myDog.getInfo());

        int[] grades = {85, 90, 78};
        Student student = new Student("Алексей", 20, grades);
        System.out.println("Средний балл: " + student.calculateAverage());
        System.out.println(student.getInfo());

        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Длина окружности: " + circle.circumference());

        Book book = new Book("1984", "Джордж Оруэлл", 1949);
        System.out.println(book.getBookInfo());

        Car car = new Car("Toyota", "Camry", 2000);
        System.out.println(car.getCarInfo());
        System.out.println("Винтажный автомобиль? " + car.isVintage());
    }
}
```
