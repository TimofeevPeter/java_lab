import java.util.Scanner;

public class Num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = readInt(scanner, "Введите первое целое число (x): ");
        int y = readInt(scanner, "Введите второе целое число (y): ");

        int result = sum2(x, y);
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

    public static int sum2(int x, int y) {
        if (((x + y) >= 10) && ((x + y) <= 19)) {
            return 20;
        } else {
            return x + y;
        }
    }
}