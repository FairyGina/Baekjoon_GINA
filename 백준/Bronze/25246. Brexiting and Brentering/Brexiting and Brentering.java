import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        char[] f={'a','e','i','o','u'};
        String s=I.readLine();
        int l=s.length(),i=l;
        L:while(--i>-1){
            for(int j=0;j<5;j++){
                if(s.charAt(i)==f[j]) break L;
            }
        }
        s=s.substring(0,i+1);
        System.out.println(s+"ntry");
    }
}