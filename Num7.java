import java.util.Scanner;

public class Num7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = readInt(scanner, "Введите любое целое число:");

        square(x);
        scanner.close();

    }

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try  {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Повторите попытку.");
            }
        }

    }

    public static void square(int x) {
        x = Math.abs(x);
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}