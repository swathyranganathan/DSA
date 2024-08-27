import java.util.Scanner;
class fun{
    private int arr[];
    private int size;
    private int capacity;
    final int initialCapacity=8;
    fun(){
        size=0;
        arr=new int[initialCapacity];
        capacity=initialCapacity;
    }
    public void expandArray(){
        capacity*=2;
        arr=java.util.Arrays.copyOf(arr,capacity);
    }
    public void add(int val){
        if(size==capacity)
            expandArray();
        arr[size]=val;
        size++;
    }
    public void display(){
        System.out.println("Element in the list:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void insert(int pos, int val){
        if(pos<0 || pos>size){
            System.out.println("Invalid");
        }
        if(size==capacity)
            expandArray();
        for(int i=size-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=val;
        size++;
    }
    public void delete(int pos2) {
        for (int i = pos2 + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        if (capacity > initialCapacity && capacity > 3 * size) {
            shrinkArray();
        }
    }
    private void shrinkArray(){
        capacity /= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);

    }


}

public class DynamicArray {
    public static void main(String[] args) {
        fun list=new fun();
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("\n--------------List Menu------------------");
            System.out.println("1.Insert at End");
            System.out.println("2.Display the list");
            System.out.println("3.Insert at specified position");
            System.out.println("4.Delete from specified position");
            System.out.println("5.Exit");
            System.out.println("---------------------------------------------");
            System.out.println("Enter your choice");
            int choice =scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter the data: ");
                    int val= scan.nextInt();
                    list.add(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("enter the position:");
                    int pos=scan.nextInt();
                    System.out.println("enter the data: ");
                    int val2=scan.nextInt();
                    list.insert(pos,val2);
                    break;
                case 4:
                    System.out.println("enter the position:");
                    int pos2=scan.nextInt();
                    list.delete(pos2);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("invalid input");
            }
        }
    }
}
//delete at end
//delete from begining
//insert at begining
//get(index)
//update(index,val)
//search(val)
//clear
//cotains(val)