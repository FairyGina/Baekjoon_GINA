import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(s.nextToken()),r=0,i=1;
        char l=s.nextToken().charAt(0);
        L:while(true){
            if(r!=n){
                String a=String.valueOf(i);
                for(int j=0;j<a.length();j++){
                    if(a.charAt(j)==l){
                        i++;
                        continue L;
                    }
                }
                r++;i++;
            }
            else break;
        }
        O.write(i-1+"\n");
        O.flush();
    }
}