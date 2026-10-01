import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int e2 = scanner.nextInt();
        int f2= scanner.nextInt();



        int sec1 = a1 * 3600 + b1 * 60 + c1;
        int sec2 = d2 * 3600 + e2 * 60 + f2;


        System.out.println(sec2 - sec1);
    }
}
