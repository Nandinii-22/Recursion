import java.util.Scanner;
public class Code_16 {
    int count_occurance(int[]arr,int s, int c, int n, int index){
        if(index == s)
        return c;
        else if(arr[index]== n){
            c+=1;
            return count_occurance(arr,s,c,n,index+1);
        }
        else
        return count_occurance(arr,s,c,n,index+1);
    }
    public static void main(String args[]){
        Code_16 obj = new Code_16();
        Scanner in = new Scanner(System.in);
        int c = 0, index = 0;
        System.out.println("enter the size");
        int s = in.nextInt();
        int arr[] = new int[s];
        for(int i=0; i<s; i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the number to count its occurance ");
        int n = in.nextInt();
        System.out.println(obj.count_occurance(arr,s,c,n, index));

    }
}
 