import java.util.Scanner;
public class Code_7 {
    int search(int[]arr, int element, int index, int n){
        if(index==n)
        return -1;
        if (arr[index]==element)
        return index;
        else
        return search(arr, element, index+1, n);

    }
    public static void main(String[] args) {
        Code_7 obj = new Code_7();
        Scanner in = new Scanner(System.in);
        int index = 0;
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int element = in.nextInt();
       System.out.println( obj.search(arr, element, index,n));

    } 
}
