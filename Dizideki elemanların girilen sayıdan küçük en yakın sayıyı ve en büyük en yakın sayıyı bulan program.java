import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {16, 4, 15, 42, 8, 23};
        System.out.println("List: " + Arrays.toString(list));
        Arrays.sort(list);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("\nEntered Number: " + number);
        if (number < min) {
            System.out.println("There is no number in the array less than the number entered!");
            System.out.println("Big number nearest to the number entered: " + min);
        }
        if (number > max) {
            System.out.println("Small number nearest to the number entered: " + max);
            System.out.println("There is no number in the array greater than the number entered!");
        }
        if (number >= list[0]) {
            for (int i = 0; i < list.length; i++) {
                if (number == min) {
                    System.out.println("There is no number in the array less than the number entered!");
                    System.out.println("Big number nearest to the number entered: " + list[1]);
                    break;
                }
                if (number == max) {
                    System.out.println("Small number nearest to the number entered: " + list[list.length - 2]);
                    System.out.println("There is no number in the array greater than the number entered!");
                    break;
                }
                if (number < list[i]) {
                    System.out.println("Small number nearest to the number entered: " + list[i - 1]);
                    System.out.println("Big number nearest to the number entered: " + list[i]);
                    break;
                }
            }
        }

    }
}
