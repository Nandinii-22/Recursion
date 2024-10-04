import java.util.*;
public class Code_13 {
    String reverse(String str){
        if(str.isEmpty()){
        System.out.println("String is empty");
        return str;
        }
        else 
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main (String args[]){
        Code_13 obj = new Code_13();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        int l = str.length();
        System.out.println(obj.reverse(str));
        
       
}
    
}
