import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();

        int c = (a1 + a2 - 1) / a1;


        System.out.println(c);
    }
}