public class lin_bin_search {
    public static void main(String[] args) {
        int num[]={1,3,5,7,9,11,13};
        int target=7;
        int result= linearsearch(num,target);
        if(result != -1){
            System.out.println("Element found at:"+result);
        }
        else{
            System.out.println("Element not found");
        }
        int result2=binarysearch(num,target);
        if(result2 != -1){
            System.out.println("Element found at:"+result2);
        }
        else{
            System.out.println("Element not found");
        }

    }
    public static int linearsearch(int[] num,int target){
        int step_lin=0;
        for(int i=0;i< num.length;i++){
            step_lin++;
            if(num[i]==target){
                System.out.println("Steps taken:"+step_lin);
                return i;
            }
        }
        return -1;
    }
    public static int binarysearch(int[] num,int target){
        int step_bin=0;
        int left=0;
        int right=num.length-1;
        while(left<=right){
            step_bin++;
            int mid=(left+right)/2;
            if(num[mid]==target){
                System.out.println("Steps taken:"+step_bin);
                return mid;
            } else if (num[mid]<target) {
                left=mid+1;//move right
            }else {
                right=mid-1;//move left
            }

        }
        return -1;
    }
}
