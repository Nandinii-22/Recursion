
import java.util.*;
import java.lang.*;
public class Code_17 {
    boolean check_anagram(String s1,String s2){
        if(s1.length() != s2.length())
        return false;
        char []a1 = s1.toCharArray();
        char []a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
    public static void main(String args[]){
        Code_17 obj = new Code_17();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(obj.check_anagram(s1,s2));
    }
    
}
