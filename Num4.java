import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число:");

        String input = scanner.nextLine();
        int x;

        try {
            x = Integer.parseInt(input);
            boolean result = isPositive(x);
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не целое число!");
        }

        scanner.close();

    }

    public static boolean isPositive (int x) {
        return x > 0;
    }
}
