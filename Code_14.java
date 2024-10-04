import java.util.*;
public class Code_14 {
    boolean isPalindrome(String s, int i, int l){
       if(i>=l)
       return true;
       if(s.charAt(i)==s.charAt(l))
       return isPalindrome(s,i+1,l-1);
       else
       return false;
    }
    public static void main(String args[]){
        Code_14 obj = new Code_14();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s =  in.nextLine();
        int i=0,l=s.length()-1;
        System.out.println(obj.isPalindrome(s,i,l));

    }
}
