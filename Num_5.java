import java.util.Scanner;
import java.util.Arrays;
public class Num_5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 2, 4, 5, 5, 20};
        int[] ins = {2, 4, 8, 9, 1000};
        int x = readInt(scanner, "Введите номер позиции для вставки массива ins в массив arr: ");

        int[] result = add(arr, ins, x);
        System.out.println("Результат: " + Arrays.toString(result));

        scanner.close();
    }


    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Повторите попытку.");
            }
        }
    }


    public static int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0) {
            pos = 0;
        }
        if (pos > arr.length) {
            pos = arr.length;
        }

        int[] result = new int[arr.length + ins.length];
        int index = 0;

        for (int i = 0; i < pos; i++) {
            result[index] = arr[i];
            index++;
        }

        for (int i = 0; i < ins.length; i++) {
            result[index] = ins[i];
            index++;
        }

        for (int i = pos; i < arr.length; i++) {
            result[index] = arr[i];
            index++;
        }

        return result;
    }
}