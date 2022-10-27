import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int max=1,min=1,number;
        int sayı;
        Scanner inp=new Scanner(System.in);
        System.out.print("KAÇ TANE SAYI GİRİCEKSİNİZ:");
        sayı =inp.nextInt();

        for (int i=1;i<=sayı;i++){
            System.out.print(i+".SAYIYA GİRİNİZ:");
            number=inp.nextInt();
            if (i==0) {
                max = number;
                min = number;
            }else if (number>max){
                max=number;
            } else if (number<min) {
                min=number;
            }
        }

        System.out.println("EN BÜYÜK SAYI:"+max);
        System.out.println("EN KÜÇÜK SAYI:"+min);
    }
}
