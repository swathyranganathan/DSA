public class selection_sort {
    public static void main(String[] args) {
        int num[]={6,89,984,34,5,64};
        int size= num.length;
        int temp=0;
        System.out.println("Before swapping:");
        for (int nums:num){
            System.out.print(nums+" ");
        }
        for(int i=0;i<size-1;i++) {
            int min = i;
            for (int j = i+1; j < size; j++) {
                if (num[min] > num[j]) {
                    min = j;
                }
            }
            temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
        System.out.println();
        System.out.println("After swapping");
        for(int nums: num){
            System.out.print(nums+" ");
        }
    }
}
