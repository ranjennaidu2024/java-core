package test;

import java.util.ArrayList;
import java.util.Collections;

public class SecondHighestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(4);
        numbers.add(10);
        numbers.add(6);

        System.out.println("Second highest number is: "+getSecondHighest(numbers));
    }

    public static int getSecondHighest(ArrayList<Integer> numbers){
        Collections.sort(numbers);
        return numbers.get(numbers.size()-2);
    }

}
