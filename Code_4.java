import java.util.Scanner;
public class Code_4 {
    int power(int a, int b){
        if (b == 0){
            return 1;
        }
        else{

            int ans = a*power(a,b-1);
            return ans;

        }
    }
    public static void main(String args[]){
        Code_4 obj = new Code_4();  
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the number");
        int a = in.nextInt();
        System.out.println("Enter the power");
        int b = in.nextInt();
        System.out.println(obj.power(a,b));
    }

}
