package SholeVariables;
import java.util.Scanner;

public class faringateCelciy {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double cel ;
        double f;
        System.out.print("Введите температуру по Цельсию :");

        cel = user_input.nextDouble();
        f = cel * 9 / 5 + 32;

        System.out.print("\nГрадусы по Цельсию :" + cel);
        System.out.print("\nГрадусы по Фаренгейту :" + f);

    }
}
