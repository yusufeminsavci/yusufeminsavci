import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int sayi=input.nextInt();
        asal(sayi,2);
    }
    static void asal(int sayi,int i){
        if (i == sayi) {
            System.out.print(sayi + " asal sayıdır.");
            return;
        } else if (sayi%i == 0) {
            System.out.print(sayi + " asal sayı değildir.");
            return;
        }

        asal(sayi, i + 1);

    }
}
