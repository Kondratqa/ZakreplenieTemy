package Denis;

public class Krest {
    public static void main(String[] args) {
        int height = 4;
        int width = height * 2 - 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == i || j == (width - 1 - i)) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < height + 4; i++) {
            for (int j = 0; j < width; j++) {
                if (j == (height - 2 - i) || j == (width - (height - 1 - i))) {
                    System.out.print("7");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
