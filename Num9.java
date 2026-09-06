import java.util.Scanner;

public class Num9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = readInt(scanner, "Введите первое целое число (a): ");
        int b = readInt(scanner, "Введите второе целое число (b): ");
        int c = readInt(scanner, "Введите третье целое число (c): ");
        
        boolean result = isEqual(a, b, c);
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
    
    public static boolean isEqual(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            return true;
        } else {
            return false;
        }
    }
}