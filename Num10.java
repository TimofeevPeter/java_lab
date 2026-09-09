import java.util.Scanner;
import java.util.Arrays;

public class Num10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа через пробел для создания массива arr:");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        int[] result = deleteNegative(arr);
        System.out.println("Результат: " + Arrays.toString(result));

        scanner.close();
    }

    public static int[] deleteNegative(int[] arr) {
        int leng = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                leng++;
            }

        }

        int[] result = new int[leng];
        if (leng == 0) {
            return result;
        }
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}