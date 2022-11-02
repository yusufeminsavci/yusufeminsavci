import java.util.Scanner;

public class main {

    static int result = 1;
    static int us(int x, int y){
        if (x == 0){
            return 1;
        }

        result *= y;
        us(x-1,y);
        return result;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.println("Tabandaki sayiyi giriniz: ");
        y = input.nextInt();
        System.out.println("Usteki sayiyi giriniz: ");
        x = input.nextInt();

        System.out.println(us(x,y));

    }
}
