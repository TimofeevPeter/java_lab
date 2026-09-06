import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день недели с маленькой буквой:");
        String x = scanner.nextLine();
        System.out.println("Результат:");

        printDays(x);
        scanner.close();
    }

    public static void printDays(String x) {
        switch (x) {
            case ("понедельник"):
                System.out.println("понедельник");
            case ("вторник"):
                System.out.println("вторник");
            case ("среда"):
                System.out.println("среда");
            case ("четверг"):
                System.out.println("четверг");
            case ("пятница"):
                System.out.println("пятница");
            case ("суббота"):
                System.out.println("суббота");
            case ("воскресенье"):
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
        }
    }
}

