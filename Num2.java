import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = readInt(scanner, "Введите первое целое число (x)");
        int y = readInt(scanner, "Введите второе целое число (y)");

        double result = safeDiv(x, y);

        System.out.println("Результат: " + result);
    }

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
    
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Введите целое число");
            }
        }
    }

    public static double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        } else {
            return (double) x / y;
        }
    }
}