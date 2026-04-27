import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        long n=Long.parseLong(s.nextToken()),b=Integer.parseInt(s.nextToken());
        StringBuilder r=new StringBuilder();
        while(true){
            if(n>0){
                long t=n%b;
                t+=t>9?55:48;
                r.insert(0,(char)t);
                n/=b;
            }
            else{
                O.write(r+"\n");
                O.flush();
                break;
            }
        }
    }
}