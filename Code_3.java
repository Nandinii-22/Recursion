import java.util.Scanner;
public class Code_3 {
    int rev_count(int n){
    if(n==0 || n==1){
        return 1;
    }
    else{
        System.out.println(n);
        return rev_count(n-1);
    }  
  }
  public static void main (String args[]){
    Code_3 obj = new Code_3();
    Scanner in = new Scanner(System.in);
    System.out.println("ENter a number");
    int n = in.nextInt();
    int ans1 = obj.rev_count(n);
    System.out.println(ans1);
  }
}
