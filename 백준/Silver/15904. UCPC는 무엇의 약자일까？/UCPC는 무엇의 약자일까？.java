import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        char[] u={'U','C','P','C','\u0000'};
        String s=I.readLine(),as="I hate UCPC";
        int l=s.length(),ct=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)==u[ct]) ct++;
        }
        if(ct>3) as="I love UCPC";
        System.out.print(as);
    }
}