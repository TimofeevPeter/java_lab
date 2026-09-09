import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = readInt(scanner, "Введите любое целое число: ");
        int y = readInt(scanner, "Введите любое целое положительное число: ");

        while (y < 0) {
            System.out.print("Степень не может быть отрицательной! Повторите ввод: ");
            y = readInt(scanner, "");
        }

        int result = pow(x, y);
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
                System.out.println("Неверный ввод! Повторите попытку:");
            }
        }
    }

    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 1; i <=y ; i++) {
            result = result * x;
        }

        return result;
    }
}