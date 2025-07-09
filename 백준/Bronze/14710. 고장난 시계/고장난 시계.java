import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int h=Integer.parseInt(st.nextToken())%30,m=Integer.parseInt(st.nextToken());
        System.out.print((m%12==0&&m/12==h)?'O':'X');
    }
}