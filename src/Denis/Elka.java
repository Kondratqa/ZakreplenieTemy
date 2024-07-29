package Denis;

import java.util.Scanner;

public class Elka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите высоту ёлочки ");

        int height = scanner.nextInt(); // Высота треугольника

        for (int i = 0; i <= height; i++) {
            // Печатаем пробелы
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            // Печатаем звездочки
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Переход на новую строку после каждой строки треугольника
            System.out.println();
        }
    }
}
