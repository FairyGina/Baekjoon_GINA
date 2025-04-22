import java.io.*;
import java.util.*;

class Main{
    public static int c(int a,int b,char r){
        switch (r) {
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            default: return a/b;
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder as=new StringBuilder();

        StringTokenizer s=new StringTokenizer(I.readLine());

        int a=Integer.parseInt(s.nextToken());
        char q=s.nextToken().charAt(0);
        int b=Integer.parseInt(s.nextToken());
        char w=s.nextToken().charAt(0);
        int c=Integer.parseInt(s.nextToken());

        int r1=c(c(a,b,q),c,w);
        int r2=c(a,c(b,c,w),q);

        as.append(Math.min(r1,r2)).append('\n').append(Math.max(r1,r2));

        O.write(as+"\n");
        O.flush();
    }
}