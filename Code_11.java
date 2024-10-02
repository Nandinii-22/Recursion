import java.util.Scanner;
public class Code_11 {
    int checking(int n, int c){
        if(n==0){
            return c;
        }
        else {
            System.out.print(n%10);
            return checking(n/10,c+1);
    
        }
    
    }
    public static void main (String args[]){
        Code_11 obj = new Code_11();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =in.nextInt();
        int c = 0;
        System.out.print("Reversed number is  ");
        System.out.println("\n" + "Number of digits = " + obj.checking(n,c));
}

}