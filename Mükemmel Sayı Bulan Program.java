import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0 ;

        System.out.print("Mukemmel sayi sorgulamasi yapacaginiz sayi : ");
        n= input.nextInt();

        for(int i=n-1 ; i>=1 ; i--){

            if(n%i==0){
                sum+=i;
            }

        }

        if(sum==n){

            System.out.println("Sayinizi mukemmel sayidir.");
        }else{
            System.out.println("Sayi mukemmel degildir.");

        }

    }
}
