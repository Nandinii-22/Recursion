import java.util.Scanner;
public class Code_6 {
    int array_sum(int arr[], int arr_size){
        if(arr_size == 0)
        return 0;
        else
        return arr[arr_size - 1] + array_sum(arr, arr_size - 1);
    }
    public static void main (String args[]){
        Code_6 obj = new Code_6();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arr_size = in.nextInt();
        int []arr = new int[arr_size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr_size;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(obj.array_sum(arr, arr_size));

    }
     

}
