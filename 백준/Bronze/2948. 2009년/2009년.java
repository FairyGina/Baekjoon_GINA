import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int d=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());

        int[] day={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dw={"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};

        for(int i=0;i<m;i++){
            d+=day[i];
        }
        System.out.print(dw[d%7]);
    }
}