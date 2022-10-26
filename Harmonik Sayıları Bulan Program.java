import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n = input.nextInt();
        double result = 0.0;
        for (double i = 1; i <= n ; i++) {
            result += (1/i);
        }
        // 1. Döngü, i = 1; result = 0 + (1/1) = 1;
        // 2. Döngü, i = 2; result = 1 + (1/2)= 1.5;

        System.out.println(result);
    }
}
