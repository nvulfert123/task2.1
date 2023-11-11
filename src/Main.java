import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positive = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        for (Integer number : intList) {
            if (number > 0) {
                positive.add(number);
            }
        }
        for (Integer number : positive) {
            if (number % 2 == 0) {
                even.add(number);
            }
        }
        Collections.sort(even);
        System.out.println("Метод без стримов");
        for (Integer number : even) {
            System.out.println(number);

        }


    }
}