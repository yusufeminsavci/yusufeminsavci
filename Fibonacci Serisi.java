import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Basamak sayisini girin ;");
        int n=scr.nextInt();
        int b=0, c=1,d;
        for (int i=1;i<=n;i++){
            d=b+c;
            System.out.println(b+"+"+c+"="+d);
            b=c;
            c=d;

            System.out.println(" ");
        }
    }
}
