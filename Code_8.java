import java.util.Scanner;
public class Code_8 {
    int calc(int[]arr, int index, int n){
        if(index == n-1)
        return arr[index]*2;
        else{
            arr[index] = arr[index]*2;
            System.out.println(arr[index]);
            return calc(arr,index+1,n);
        }
    }

    public static void main(String[] args) {
        Code_8 obj = new Code_8();
        Scanner in = new Scanner(System.in);
        int index = 0;
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
      System.out.println(obj.calc(arr, index,n));

    } 
}
