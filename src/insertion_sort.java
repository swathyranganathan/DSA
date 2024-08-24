import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] num=new int[size];
        System.out.println("Enter array of numbers:");

        for(int i=0;i<size;i++){
            num[i]=scan.nextInt();

        }
        System.out.println("before sorting:");
        for(int nums:num){
            System.out.print(nums+" ");
        }
        for(int i=1;i<size;i++){
           int key=num[i];
           int j= i-1;
           while (j>=0  && key<num[j] ){
               num[j+1]=num[j];
               j--;
           }//every time at the end j will be j<0 , simply placing key in num[j+1]
           num[j+1]=key;

        }
        System.out.println();
        System.out.println("After Sorting:");
        for(int nums:num){
            System.out.print(nums+" " );
        }

    }
}
