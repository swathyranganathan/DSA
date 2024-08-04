public class bubble_sort {
    public static void main(String[] args) {
        int num[]={78,47,393,75,34};
        int size= num.length;
        int temp =0;
        //to print the value before sorting
        System.out.println("before sorting");
        for(int nums:num){
            System.out.print(nums+" ");
        }
        System.out.println();
        System.out.println("during sorting");

        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){  /*note: size-1, because in every
             iteration you get the last value fixed(no change in last value)*/
                if (num[j] > num[j+1]) {
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }

            }
            System.out.println();
            for(int nums:num){
                System.out.print(nums+" ");

            }

        }
        System.out.println();
        System.out.println("after sorting");
        for(int nums:num){
            System.out.print(nums+" ");
        }

    }
}
