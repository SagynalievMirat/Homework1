import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int secondsInDay = 24 * 60 * 60;
        n %= secondsInDay;

        int hours = n / 3600;
        int minutes = (n % 3600) / 60;
        int seconds = n % 60;

        System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);
    }
}
