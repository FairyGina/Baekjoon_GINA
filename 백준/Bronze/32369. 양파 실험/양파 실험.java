import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(s.nextToken()),a=Integer.parseInt(s.nextToken()),b=Integer.parseInt(s.nextToken()),o=1,p=1;
        for(int i=0;i<n;i++){
            o+=a; p+=b;
            if(o<p){
                int t=o;
                o=p; p=t;
            }
            else if(o==p) p--;
        }
        O.write(o+" "+p+"\n");
        O.flush();
    }
}