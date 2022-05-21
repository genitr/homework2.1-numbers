package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] list = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        List<Integer> intList = new ArrayList<>();


        for (int i = 0; i < list.length; i++) {
            intList.add(list[i]);
        }

        Collections.sort(intList);
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0) {
                if (intList.get(i) %2 == 0) {

                    // если сортировку сделать в этом месте, то в список попадает число -1
                    // не могу понять почему
                    //Collections.sort(intList);
                    System.out.print(intList.get(i) + ", ");
                }
            }
        }
    }
}
