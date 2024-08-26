import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayInJava {
    public static void main(String[] args) {
        int[] num1={45,35,6,98,3,23,1};
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));

        String[] friuts ={"orange","mango","apple","banana","grape"};
        Arrays.sort(friuts);
        System.out.println(Arrays.toString(friuts));
        Arrays.sort(friuts, Collections.reverseOrder());
        System.out.println(Arrays.toString(friuts));


        String[] abc=new String[2];
         abc[0]="abc";
         abc[1]="abe";
        System.out.println(abc[0].compareTo(abc[1]));
        Arrays.sort(abc);
        System.out.println(Arrays.toString(abc));

    }
}
