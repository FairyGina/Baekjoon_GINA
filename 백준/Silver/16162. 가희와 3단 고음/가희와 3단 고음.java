import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(s.nextToken()),a=Integer.parseInt(s.nextToken()),d=Integer.parseInt(s.nextToken()),r=0;
        s=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            if(Integer.parseInt(s.nextToken())==a){
                r++; a+=d;
            }
        }
        System.out.println(r);
    }
}