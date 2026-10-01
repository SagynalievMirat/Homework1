import java.util.Scanner;

public class V {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int diff = a - b;
        int isAGreater = (diff + 1000) / 1000;
        int isBGreater = 1 - isAGreater;

        System.out.println(a * isAGreater + b * isBGreater);
    }
}
