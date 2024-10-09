import java.io.*;
import java.lang.*;
public class Code_19 {
    int maximize_cuts(int n, int x, int y, int z){
        if(n == 0)
        return 0;
        if(n<0)
        return Integer.MIN_VALUE;
        int a = 1 + maximize_cuts(n-x,x,y,z);
        int b = 1 + maximize_cuts(n-y,x,y,z);
        int c = 1 + maximize_cuts(n-z,x,y,z);
        int ans = Math.max(a,Math.max(b,c));
        return ans;
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Code_19 obj = new Code_19();
        System.out.println("Enter total length");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter 3 cut lengths");
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z= Integer.parseInt(br.readLine());
        System.out.println(obj.maximize_cuts(n,x,y,z));
    }
}

