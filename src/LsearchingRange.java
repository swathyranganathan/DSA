public class LsearchingRange {
        public static void main(String[] args) {
            //example: arr=[23,45,6,7,86,89,67]
            //Q: search for 6 in the range of index[1,4]
            int[] arr={18,12,-7,3,24,28};
            int target =3;
            System.out.println(linearsearch(arr,target,1,4));

        }
        static int linearsearch(int[] arr,int target,int start, int end){
            if(arr.length==0){
                return -1;
            }
            for(int i=start;i<=end;i++){
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
        }
    }

