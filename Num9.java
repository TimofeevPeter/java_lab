import java.util.Scanner;

public class Num9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = readInt(scanner, "Введите любое целое положительное число");

        rightTriangle(x);
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

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = i; j < x; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");               
            }
            System.out.println();
        }
    }
}