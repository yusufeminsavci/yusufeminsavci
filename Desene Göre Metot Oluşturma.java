import java.util.Scanner;


public class main {
    static void f(int n){
        System.out.print(n+" ");
        if(n>0){
            f(n-5);
            System.out.print(n+" ");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int n=input.nextInt();
        f(n);
        input.close();

    }
}
