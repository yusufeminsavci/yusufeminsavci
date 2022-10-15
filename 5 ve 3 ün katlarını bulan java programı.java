import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        if(sayi1 > sayi2) {
            System.out.print("sayi1 sayi2 den büyüktür.");
        }
        else if(sayi1 < sayi2) {
            System.out.print("sayi1 sayi2 den küçüktür.");

        }
        else {
            System.out.println("Girilen sayilar birbirine eşittir.");

        }


            }
        }


























