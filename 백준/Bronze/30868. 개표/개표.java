import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String f="++++";
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int n=Integer.parseInt(I.readLine()),i=n/5;
            while(i-->0) as.append(f+" ");
            i=n%5;
            while(i-->0) as.append('|');
            as.append('\n');
        }
        System.out.println(as);
    }
}