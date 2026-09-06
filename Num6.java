import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = readInt(scanner, "Введите первое целое число (x): ");
        int y = readInt(scanner, "Введите второе целое число (y): ");
        int z = readInt(scanner, "Введите третье целое число (z): ");

        boolean result = sum3(x, y, z);
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
                System.out.println("Неверный ввод! Введите целое число:");
            }
        }
    }

    public static boolean sum3(int x, int y, int z) {
        if (x + y == z) {
            return true;
        } else if (x + z == y) {
            return true;
        } else if (y + z == x) {
            return true;
        } else {
            return false;
        }
    }

}