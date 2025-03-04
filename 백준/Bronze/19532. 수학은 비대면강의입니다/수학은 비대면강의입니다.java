import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int[] x=new int[6];
        for(int i=0;i<6;i++) x[i]=Integer.parseInt(s.nextToken());
        O.write((x[1]*x[5]-x[4]*x[2])/(x[1]*x[3]-x[0]*x[4])+" ");
        O.write((x[0]*x[5]-x[3]*x[2])/(x[0]*x[4]-x[1]*x[3])+"\n");
        O.flush();
    }
}