import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        char[] arr={'A','E','I','O','U','a','e','i','o','u'};
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            String s=I.readLine();
            int len=s.length(),r=len,vow=0;
            for(int i=0;i<len;i++){
                char c=s.charAt(i);
                if(c==' ') r--;
                for(int j=0;j<10;j++){
                    if(c==arr[j]){
                        vow++;
                        break;
                    }
                }
            }
            as.append(r-vow).append(' ').append(vow).append('\n');
        }
        System.out.print(as);
    }
}