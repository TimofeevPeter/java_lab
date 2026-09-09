import java.util.Scanner;

public class Num6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = readInt(scanner, "Введите любое целое число: ");

        boolean result = equalNum(x);
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
                System.out.println("Неверный ввод! Повторите попытку");
            }
        }
        
    }

    public static boolean equalNum(int x) {
        x = Math.abs(x);
        int standart = x % 10;
        boolean resualt = true ;
        while (x > 0) {
            int predlast = x % 10;
            if (predlast != standart) {
                resualt = false;
            }
            x = x / 10;
        }
        return resualt;
    }
}