import java.util.Scanner;


public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = readInt(scanner, "Введите любое целое положительное число: ");
        String result = ListNums(x);
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
                System.out.println("Неверный ввод! Повторите ввод.");
            }
        }
    }

    public static String ListNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result = result + i + " ";
        }
        return result.trim();
    }
}