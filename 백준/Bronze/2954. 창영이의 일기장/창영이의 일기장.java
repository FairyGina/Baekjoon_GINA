import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        char[] vw={'a','e','i','o','u'};
        String s=I.readLine();
        int len=s.length()-1,i=-1;
        L:while(++i<len){
            char c=s.charAt(i);
            for(int j=0;j<5;j++){
                if(c==vw[j]){
                    if(s.charAt(i+1)=='p'&&s.charAt(i+2)==c){
                        as.append(c);
                        i+=2;
                        continue L;
                    }
                }
            }
            as.append(c);
        }
        if(i==len) as.append(s.charAt(len));
        System.out.print(as);
    }
}