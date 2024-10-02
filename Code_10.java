import java.util.Scanner;
public class Code_10 {
    int rev_arr(int[]arr, int index){
        if(index==0)
        return arr[0];
        else
        System.out.println(arr[index]);
        return rev_arr(arr,index-1);
    }
    public static void main (String args[]){
        Code_10 obj = new Code_10();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        int size =in.nextInt();
        int index = size - 1;
        int arr[] = new int[size];
        System.out.println("Enter array elements");
        for(int i = 0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(obj.rev_arr(arr,index));
}
}