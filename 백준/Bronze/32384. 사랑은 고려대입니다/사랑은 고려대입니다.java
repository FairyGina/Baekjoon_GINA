import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder a=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        for(int i=0;i<n;i++) a.append("LoveisKoreaUniversity ");
        O.write(a+"\n");
        O.flush();
    }
}