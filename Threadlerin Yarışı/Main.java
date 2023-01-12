package threadRace;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            array.add(i);
        }

        List<Integer> subArray1 = array.subList(0, 25);
        List<Integer> subArray2 = array.subList(25, 50);
        List<Integer> subArray3 = array.subList(50, 75);
        List<Integer> subArray4 = array.subList(75, 100);

        threadRace.HelperClass helper1 = new threadRace.HelperClass(subArray1);
        helper1.start();

        threadRace.HelperClass helper2 = new threadRace.HelperClass(subArray2);
        helper2.start();

        threadRace.HelperClass helper3 = new threadRace.HelperClass(subArray3);
        helper3.start();

        threadRace.HelperClass helper4 = new threadRace.HelperClass(subArray4);
        helper4.start();
    }
}
