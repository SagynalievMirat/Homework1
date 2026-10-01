import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = Math.sqrt(a * a + b * b);

        System.out.println(c);

    }
}