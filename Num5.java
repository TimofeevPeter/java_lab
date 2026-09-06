import java.util.Scanner; 

public class Num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = readInt(scanner, "Введите первое целое число (x): ");
        int y = readInt(scanner, "Введите второе целое число (y): ");
        int z = readInt(scanner, "Введите третье целое число (z): ");

        int result = max3(x, y, z);
        System.out.println("Результат: " + result);
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

    public static int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        } 

        if (z > max) {
            max = z;
        }

        return max;
    }
}
