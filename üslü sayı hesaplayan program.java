import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı :");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();
        int total = 1;

        // 3^4 = 3 * 3 * 3 * 3
        int i = 1;
        while (i <= k){
            total *= n;
            System.out.println(i);
            i++;
        }


        System.out.println("Cevap : " + total);
    }
}
