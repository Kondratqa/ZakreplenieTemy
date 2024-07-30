package Denis;

import java.util.Scanner;

public class LoopsConditionalStatements {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Введите высоту пирамиды: ");

        int visota = 20; //scanner.nextInt();
        for (int y = 0; y < visota; y++) { // количество строчек "координата Х"
            for (int x = 0; x < visota; x++) { // количество звездочек "координата y"
                if (x < visota - (1 + y)) {
                    System.out.print(" "); // Пробелы
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}