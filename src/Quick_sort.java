public class Quick_sort {
    public static void quickSort(int[] arr,int low, int high){
        if(low<high){
            int pi= partition(arr,low, high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);

        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];//choosing the last element as the pivot
        int i=(low-1); //index of the smaller element -1
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }//if false it return nothing i remain -1
        }
        swap(arr,i+1,high);
        return (i+1);
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={5,8,9,3,4,2,3};
        System.out.println("before sorting: ");
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After sorting:");
        for(int nums:arr){
            System.out.print(nums+" ");
        }

    }
}
