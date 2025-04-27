import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(I.readLine());
        int n[]=new int[1001];
        while(t-->0){
            n[Integer.parseInt(I.readLine())]++;
        }
        Arrays.sort(n);
        System.out.println(n[1000]);
    }
}