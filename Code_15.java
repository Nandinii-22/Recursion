import java.util.Scanner;
class Code_15{
    int max(int[]arr, int s, int l, int m ){
        if(l>=s)
        return m;
        if(arr[l]>m){
            m = arr[l];
            return max(arr,s,l+1,m);
        }
        else
        return max(arr,s,l+1,m);
    }
    int min(int[]arr, int s, int p,int c){
        if(p>=s)
        return c;
        if(arr[p]<c){
            c = arr[p];
            return min(arr,s,p+1,c);
        }
        else
        return min(arr,s,p+1,c);
          
    }
    public static void main(String[] args) {
        Code_15 obj = new Code_15();
        Scanner in = new Scanner(System.in);
        int l = 0, m = 0;
        System.out.println("enter the size");
        int s = in.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter array elements");
        for(int i = 0; i<s; i++){
            arr[i] = in.nextInt();
        }  
        System.out.print("The maximum element is ");
        System.out.println(obj.max(arr,s,l, m));
        int c = arr[0], p = 0;
        System.out.print("The minimum element is ");
        System.out.println(obj.min(arr,s,p, c));        
    }
}