package BinaryGap;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Solution s = new Solution();

        // Example 1
        int input1 = 9;     // Binary: 1001
        int expectedOutput1 = 2;
        System.out.println(expectedOutput1 == s.solution(input1));

        // Example 2
        int input2 = 529;   // Binary: 1000010001
        int expectedOutput2 = 4;
        System.out.println(expectedOutput2 == s.solution(input2));

        // Example 3
        int input3 = 20;    // Binary: 10100
        int expectedOutput3 = 1;
        System.out.println(expectedOutput3 == s.solution(input3));

        // Example 4
        int input4 = 15;    // Binary: 1111
        int expectedOutput4 = 0;
        System.out.println(expectedOutput4 == s.solution(input4));

        // Example 5
        int input5 = 32;    // Binary: 100000
        int expectedOutput5 = 0;
        System.out.println(expectedOutput5 == s.solution(input5));

        // Example 6
        int input6 = 1041;  // Binary: 10000010001
        int expectedOutput6 = 5;
        System.out.println(expectedOutput6 == s.solution(input6));

        // Example 7
        int input7 = 1;     // Binary: 1
        int expectedOutput7 = 0;
        System.out.println(expectedOutput7 == s.solution(input7));

        // Example 8
        int input8 = 66561; // Binary: 10000010000000001
        int expectedOutput8 = 9;
        System.out.println(expectedOutput8 == s.solution(input8));

        int input9 = 1379942674;
        int expectedOutput9 = 7;
        System.out.println("binary" + Integer.toBinaryString(input9));
        System.out.println("got "+ s.solution(input9));
        System.out.println(expectedOutput9 == s.solution(input9));
    }


    public static <T> boolean isListCircularList(ArrayList<T> list){

        ArrayList<T> secondList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while(it.hasNext()){
            T item = it.next();
            if(secondList.contains(item))
                return false;
            else
                secondList.add(item);
        }
        return true;
    }
}
