import java.util.Scanner;
public class Code_5 {
    int fib(int n){
        if(n == 0)
        return 0;
        if(n == 1)
        return 1;
        else
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]){
        Code_5 obj = new Code_5();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println(obj.fib(n));
    }
}
