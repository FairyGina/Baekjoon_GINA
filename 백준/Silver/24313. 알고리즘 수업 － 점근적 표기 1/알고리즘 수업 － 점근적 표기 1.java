import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int a1=Integer.parseInt(s.nextToken()),a0=Integer.parseInt(s.nextToken());
        int c=Integer.parseInt(I.readLine()),n=Integer.parseInt(I.readLine());
        int a=0;
        for(int i=n;i<101;i++){
            if(a1*i+a0<=c*i){
                a=1;
            }
            else{
                a=0;
                break;
            }
        }O.write(a+"\n");
        O.flush();
    }
}