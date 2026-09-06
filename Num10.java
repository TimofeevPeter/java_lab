import java.util.Scanner;

public class Num10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int result = readInt(scanner, "");

        for (int i = 2; i <= 5; i++) {
            System.out.println("Введите число: " + i + ": ");
            int next = readInt(scanner, "");
            result = lastNumSum(result,next);
            System.out.println("Промежуточный результат: " + result);
        }

        System.out.println("Итого: " + result);

        scanner.close();
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Это не целое число, повторите ввод:");
            } 
        }
    }
}