import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine()),r=0,ar=0;
        StringTokenizer s=new StringTokenizer(I.readLine());
        while(t-->0){
            if(Integer.parseInt(s.nextToken())>0) r++;
            else{
                if(ar<r) ar=r;
                r=0;
            }
        }
        if(ar<r) ar=r;
        O.write(ar+"\n");
        O.flush();
    }
}