import java.util.Scanner;

public class find_mini {
    public static void main(String[] args) {
        //Q:find minimum element in the array
        //   int[] arr = new int[7];
        //   Scanner input= new Scanner(System.in);
        //   System.out.println("enter 7 numbers: ");

        //  for (int j = 0; j < arr.length; j++) {
        //    arr[j] = input.nextInt();}
        int[] arr={45,67,9,89,78};

        // input.close();
        System.out.println("the minimum element is: " + mini(arr));
        System.out.println("the maximum element is: " + maxi(arr));
    }

    static int mini(int[] arr) {
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
            }
        }
        return mini;

    }

    static int maxi(int[] arr) {
        int maxi = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (maxi < arr[k]) {
                maxi = arr[k];
            }
        }
        return maxi;
    }
}

