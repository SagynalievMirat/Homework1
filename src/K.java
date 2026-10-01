import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int h = (n / 60) % 24;
        int m = n % 60;

        System.out.println(h + " " + m);
    }
}