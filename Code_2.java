import java.util.Scanner;
public class Code_2 {
    int fact (int n){
        if (n==0){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
    public static void main(String args[]){
        Code_2 obj = new Code_2();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int ans = obj.fact(n);
        System.out.println(ans);


    }
}
