import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() - 1;

        int lessonsTime = (n + 1) * 45;
        int breaksTime = (n / 2) * 15 + ((n + (n % 2)) / 2) * 5;
        int totalMinutes = lessonsTime + breaksTime;

        int hours = 9 + totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + " " + minutes);
    }
}
