import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(I.readLine()),f=Integer.parseInt(I.readLine()),min,max;
        min=max=f;
        while(t-->1){
            int n=Integer.parseInt(I.readLine());
            if(min>n)min=n;
            else if(max<n)max=n;
        }
        System.out.print(f==max?"hard":f==min?"ez":"?");
    }
}