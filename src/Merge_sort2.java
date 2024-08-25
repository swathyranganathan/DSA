import javax.swing.*;
import java.util.Arrays;

public class Merge_sort2 {
    public static int[] mergesort(int[] arr) {
        if (arr.length == 1)
            return arr;
        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] joined = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                joined[k] = first[i];
                k++;
                j++;
            } else {
                joined[k] = second[j];
                k++;
                j++;
            }
            while (i < first.length)
                joined[k++] = first[i++];
            while (j < second.length)
                joined[k++] = second[j++];
        }
        return joined;
        /* 1. Use two pointers i and j to track the current index of first and second, respectively.
2.Use a third pointer k to track the current index in the joined array.
3.Compare elements of first and second and copy the smaller element to joined.
4.After one of the arrays is exhausted, copy the remaining elements from the other array.  */
    }

    public static void main(String[] args) {
        int arr[]={5,4,7,1};
        System.out.println("before sorting:");
        System.out.println(Arrays.toString(arr));

        int[] sortedArr= mergesort(arr);

        System.out.println("after sorting:");
        System.out.println(Arrays.toString(sortedArr));
    }
}

