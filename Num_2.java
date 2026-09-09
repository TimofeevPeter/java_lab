import java.util.Scanner;

public class Num_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 2, 2, 2, 4, 5, 5, 20};
        int x = readInt(scanner, "Введите искомое целое число: ");

        int result = findLast(arr, x);
        System.out.println("Результат: " + result);

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

    public static int findLast(int[] arr, int x) {
        int lastch = -1; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastch = i;
            }
        }
        return lastch;
    }

}