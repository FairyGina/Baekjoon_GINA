import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        Set<Integer> num=new HashSet<>();
        StringTokenizer s=new StringTokenizer(I.readLine());
        while(n-->0) num.add(Integer.valueOf(s.nextToken()));
        n=Integer.parseInt(I.readLine());
        s=new StringTokenizer(I.readLine());
        while(n-->0){
            int r=0;
            if(num.contains(Integer.valueOf(s.nextToken()))) r=1;
            O.write(r+" ");
        }
        O.flush();
    }
}