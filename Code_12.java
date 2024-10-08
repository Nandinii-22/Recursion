import java.util.Scanner;
public class Code_12 {
    boolean check_sorted(int []arr, int size, int index){
        if(index >= size)
        return true;
        if(arr[index]>arr[index-1]){
        boolean ans = check_sorted(arr, size, index+1);
        return ans;
        }
        else
        return false;
    }
    int binary_search(int[]arr, int index, int size,int e){
        if(index>size)
        return -1;
        int mid = (index+size)/2;
        if(arr[mid] == e ){
            return mid;
        }
        if(arr[mid]>e){
            return binary_search(arr,index,mid -1,e);
        }
        if(arr[(index+size)/2]<e){
            return binary_search(arr,mid+1,size,e);
        }
        else return -1;
    }
     public static void main (String args[]){
        Code_12 obj = new Code_12();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = in.nextInt();
        int index = 0;
        int mid = (index+size)/2;
        int arr[] = new int[size];
        System.out.println("Enter array elements");
        for(int i = 0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int e = in.nextInt(); 
        boolean is_sorted = obj.check_sorted(arr,size,index+1);
        if( is_sorted ){
        System.out.println("Array is sorted");
        System.out.println(obj.binary_search(arr,index,size,e));
        }
        else 
        System.out.println("Array is not sorted");
}
}