import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = readInt(scanner, "Введите первое целое число (a): ");
        int b = readInt(scanner, "Введите второе целое число (b): ");
        
        boolean result = isDivisor(a, b);
        System.out.println("Результат: " + result);
        
        scanner.close();
    }

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(" Это не целое число! Повторите ввод:");
            }
        }
    }

    public static boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        }
        return b % a == 0 || a % b == 0;
    }
}