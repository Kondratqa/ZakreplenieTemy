package SholeVariables;

import java.util.Scanner;

public class SravniNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //// создаём объект класса Scanner
        int i = 0;

        System.out.println("Введите целое число ");

        if (sc.hasNext()) { // возвращает истинну если с потока ввода можно считать целое число
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            if (i%2 == 0) {
                System.out.println("Число" + " " + i + " " + "Четное");
            } else {
                System.out.println("Вы ввели не четное целое число");
            }

        }

    }
}
