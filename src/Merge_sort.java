public class Merge_sort {
    public static void divide(int[] arr,int s, int e){
        if(s<e){
            int mid=(s+e)/2;
            divide(arr,s,mid);
            divide(arr,mid+1,e);


            merge(arr,s,mid,e);
        }
    }
    public static void merge(int[] arr, int s, int mid, int e){
        int n1=mid-s+1; //size of 1st half
        int n2=e-mid;  //size of 2nd half

        //create temporary array
        int sarr[]=new int[n1];
        int earr[]=new int[n2];

        //copy data to temporary array
        for(int x=0;x<n1;x++){
            sarr[x]=arr[s+x];
        }
        for(int x=0;x<n2;x++){
            earr[x]=arr[mid+1+x];
        }

        //merge the temporary array
        int i=0; // Initial index of the first subarray
        int j=0; // Initial index of the second subarray
        int k=s; // Initial index of merged subarray


        while (i<n1 && j<n2){
            if(sarr[i]<=earr[j]){
                arr[k]=sarr[i];
                i++;
            }
            else {
                arr[k]=earr[j];
                j++;
            }
            k++;
        }
        // Copy the remaining elements of sarr, if any
        while(i<n1){
            arr[k]=sarr[i];
            i++;
            k++;
        }
        // Copy the remaining elements of earr, if any
        while(j<n2){
            arr[k]=earr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr={8,5,9,1,6,7};
        System.out.println("before sorting");
        for(int nums:arr ){
            System.out.print(nums+" ");
        }
        divide(arr,0,arr.length-1);
        System.out.println();
        System.out.println("after sorting");
        for(int nums:arr ) {
            System.out.print(nums + " ");
        }
    }
}
