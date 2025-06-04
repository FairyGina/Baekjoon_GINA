import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int n=Integer.parseInt(I.readLine());

        char[] ch=new char[n];
        Arrays.fill(ch,'*');
        for(int i=0;i<n;i++){
            as.append(ch).append('\n');
        }
        System.out.print(as);
    }
}