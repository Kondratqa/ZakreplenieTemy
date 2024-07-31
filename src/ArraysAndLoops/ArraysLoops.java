package ArraysAndLoops;

public class ArraysLoops {
    public static void main(String[] args) {
        sumArray();

    }
    public static void sumArray () {
        int[] arr = {1, 6, 4, 2, 2 };
        int result = 0;
        /*result += arr[0];
        result += arr[1];
        result += arr[2];
        result += arr[3];
        result += arr[4];*/
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
