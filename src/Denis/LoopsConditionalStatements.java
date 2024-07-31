package Denis;

import java.util.Scanner;

public class LoopsConditionalStatements {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту пирамиды: ");
        int visota = 0;
        while (true) {
            if(scanner.hasNextInt()) {
                visota = scanner.nextInt();
                if (visota > 2 && visota < 10) {
                    break;
                }
            }
            scanner.nextLine();
        }
        */
        for (int y = 0; y < 5; y++) { // количество строчек "координата Х"
            for (int x = 0; x < 5; x++) {
                //System.out.println("y: " + y + "x:" + x + " visota - (y + 1): " + (visota - (y + 1)));
                // количество звездочек "координата y"
                if (x < 5 - (1 + y)) {
                    System.out.print(" "); // Пробелы
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}