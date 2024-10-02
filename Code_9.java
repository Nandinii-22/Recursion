import java.util.Scanner;
public class Code_9 {
    int gcd(int a, int b){
        if (b==0)
        return a;
        else
        return gcd(b,a%b);
    }
    public static void main (String args[]){
        Code_9 obj = new Code_9();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = obj.gcd(a,b);
        System.out.println(ans);

    }
}
