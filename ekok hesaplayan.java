import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ekok = 0;
        int max;

        System.out.print("1. Sayiyi giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        int sayi2 = scanner.nextInt();
        max = sayi1 * sayi2;

        for(int i = max; i > 0; i--);
        {
            int i = 0;
            if(i % sayi1 == 0 & i % sayi2 == 0) {
                ekok = i;


            }
        }
        System.out.println("Ekok = * + ekok");

      }

    }




