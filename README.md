
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
---

Конечно! Давайте разберем код по строкам и объясним каждую часть.

import java.util.Scanner;

- **Импортируем класс Scanner:** Этот класс позволяет считывать ввод пользователя с консоли. Мы используем его для получения текста, который нужно анализировать.

public class ColemanLiauIndex {

- **Объявляем класс:** Это начало определения класса ColemanLiauIndex, который содержит основной код программы.

    public static void main(String[] args) {

- **Основной метод:** Это точка входа в программу. Метод main выполняется при запуске программы.

        Scanner scanner = new Scanner(System.in);

- **Создаем объект Scanner:** Мы создаем экземпляр Scanner, который будет использоваться для считывания ввода с консоли.

        System.out.println("Введите текст:");

- **Выводим сообщение:** Программа просит пользователя ввести текст, который будет анализироваться.

        String text = scanner.nextLine();

- **Считываем ввод:** С помощью метода nextLine() мы считываем строку текста, введенную пользователем, и сохраняем ее в переменной text.

        int letterCount = countLetters(text);

- **Подсчет букв:** Вызываем метод countLetters, передавая ему текст, и сохраняем результат (количество букв) в переменной letterCount.

        int wordCount = countWords(text);

- **Подсчет слов:** Вызываем метод countWords, передавая ему текст, и сохраняем результат (количество слов) в переменной wordCount.

        int sentenceCount = countSentences(text);

- **Подсчет предложений:** Вызываем метод countSentences, передавая ему текст, и сохраняем результат (количество предложений) в переменной sentenceCount.

        if (wordCount == 0) {
            System.out.println("Текст не содержит слов.");
            return;
        }

- **Проверка на количество слов:** Если количество слов равно нулю, программа выводит сообщение и завершает выполнение, чтобы избежать деления на ноль.

        double L = (double) letterCount / wordCount * 100;

- **Вычисление L:** Вычисляем среднее количество букв на 100 слов. Используем приведение к типу double, чтобы получить точное значение.

        double S = (double) sentenceCount / wordCount * 100;

- **Вычисление S:** Вычисляем среднее количество предложений на 100 слов аналогично предыдущему шагу.

        double index = 0.0588 * L - 0.296 * S - 15.8;

- **Вычисление индекса Колмана — Лиау:** Применяем формулу для вычисления индекса, используя ранее вычисленные значения L и S.

        if (index > 16) {
            System.out.println("Grade 16+");
        } else if (index >= 1 && index <= 16) {
            System.out.printf("Grade %.0f%n", Math.round(index));
        } else {
            System.out.println("Grade before 1");
        }

- **Вывод результата:** В зависимости от значения индекса:
  - Если индекс больше 16, выводим "Grade 16+".
  - Если индекс находится в диапазоне от 1 до 16, округляем его и выводим соответствующий класс.
  - Если индекс меньше 1, выводим "Grade before 1".

### Методы подсчета:

    private static int countLetters(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

- **Метод countLetters:**
  - Создаем переменную count для подсчета букв.
  - Перебираем каждый символ текста. Если символ является буквой (проверяем с помощью Character.isLetter), увеличиваем счетчик count.
  - Возвращаем общее количество букв.

    private static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length == 1 && words[0].isEmpty() ? 0 : words.length; // Обработка пустого ввода
    }

- **Метод countWords:**
  - Убираем лишние пробелы в начале и конце текста с помощью trim(),


затем разбиваем текст на слова по пробелам (split("\\s+")).
  - Если массив слов содержит только одну пустую строку, возвращаем 0. В противном случае возвращаем количество слов.

    private static int countSentences(String text) {
        String[] sentences = text.split("[.!?]");
        return sentences.length == 1 && sentences[0].isEmpty() ? 0 : sentences.length; // Обработка пустого ввода
    }

- **Метод countSentences:**
  - Разбиваем текст на предложения по символам конца предложения (точка, вопросительный и восклицательный знаки).
  - Проверяем, если массив содержит только одну пустую строку, возвращаем 0. В противном случае возвращаем количество предложений.

Таким образом, программа последовательно выполняет все шаги для подсчета необходимых параметров текста и вычисления индекса Колмана — Лиау.
