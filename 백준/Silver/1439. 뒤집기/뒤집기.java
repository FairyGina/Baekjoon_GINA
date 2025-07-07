import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        String s=I.readLine();
        int len=s.length(),res=1;
        for(int i=1;i<len;i++){
            if(s.charAt(i-1)!=s.charAt(i)) res++;
        }
        System.out.print(res/2);
    }
}