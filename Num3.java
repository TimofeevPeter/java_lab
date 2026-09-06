import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одну цифру от 0 до 9:");

        String input = scanner.nextLine();

        if (input.length() == 1 && input.charAt(0) >= '0' && input.charAt(0) <= '9') {
            int result = charToNum(input.charAt(0));
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Это не цифра!");
        }
        scanner.close();
    }
    public static int charToNum (char x) {
        return x - '0';
    }
}
