import java.util.Scanner;
import java.util.Arrays;

public class Num_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целые числа через пробел для создания массива arr1:");
        String input1 = scanner.nextLine();

        String[] parts1 = input1.split(" ");
        int[] arr1 = new int[parts1.length];

        for (int i = 0; i < parts1.length; i++) {
            arr1[i] = Integer.parseInt(parts1[i]);
        }

        System.out.println("Введите целые числа через пробел для создания массива arr2:");
        String input2 = scanner.nextLine();

        String[] parts2 = input2.split(" ");
        int[] arr2 = new int[parts2.length];

        for (int i = 0; i < parts2.length; i++) {
            arr2[i] = Integer.parseInt(parts2[i]);
        }

        int[] result = concat(arr1, arr2);

        System.out.println("Результат: " + Arrays.toString(result));
        scanner.close();
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            result[index] = arr2[i];
            index++;
        }

        return result;
    }

}