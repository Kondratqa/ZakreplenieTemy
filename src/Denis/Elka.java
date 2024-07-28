package Denis;

public class Elka {
    public static void main(String[] args) {
        int height = 20; // Высота треугольника

        for (int i = 1; i <= height; i++) {
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
