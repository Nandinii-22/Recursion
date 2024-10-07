import java.util.*;
public class Code_18 {
    void string_subsequence(String s, String output, int index){
        if(index >= s.length()){
            System.out.println("->"+output);
            return;
        }
        char ch = s.charAt(index);
        string_subsequence(s,output,index+1);
        output +=ch; 
        string_subsequence(s,output,index+1);
    }
    public static void main(String[] args) {
        Code_18 obj = new Code_18();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
        String output = "";
        int index = 0;
        obj.string_subsequence(s,output,index); 
    }
    
}
