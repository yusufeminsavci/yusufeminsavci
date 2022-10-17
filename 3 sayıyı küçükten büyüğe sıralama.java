import java.util.Scanner;

public class main {



  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayı : ");
        int a = scanner.nextInt();

        System.out.print("2. Sayı : ");
        int b = scanner.nextInt();

        System.out.print("3. Sayı : ");
        int c = scanner.nextInt();

        if((a < b) && (a < c)) {
            if(b < c) {
                System.out.println("a < b < c");
            }else {
                System.out.println("a < c < b");
            }
        }else if((b < a) && (b < c)) {
            if(a < c) {
                System.out.println("b < a < c");
            }else {
                System.out.println("b < c < a");
            }
        }else if((c < a) && (c < b)) {
            if(a < b) {
                System.out.println("c < a < b");
            }else {
                System.out.println("c < b < a");
            }
        }else {
            System.out.println("Sayılar eşittir.");
        }


    }

}
