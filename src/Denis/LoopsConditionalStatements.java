package Denis;

public class LoopsConditionalStatements {
    public static void main(String[] args) {
        for (int y = 0; y < 10; y++) { // количество строчек "координата Х"
            for (int x = 0; x < 10; x++) { // количество звездочек "координата y"
                if (y > 2 && y < 7) {
                    System.out.print("0"); // Пробелы
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}