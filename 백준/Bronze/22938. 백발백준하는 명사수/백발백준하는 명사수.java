import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(I.readLine());
        Long x1=Long.parseLong(st.nextToken()),y1=Long.parseLong(st.nextToken()),r1=Long.parseLong(st.nextToken());
        
        st=new StringTokenizer(I.readLine());
        Long x2=Long.parseLong(st.nextToken()),y2=Long.parseLong(st.nextToken()),r2=Long.parseLong(st.nextToken());

        if(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<(r1+r2)*(r1+r2)){
            System.out.print("YES");
        } else System.out.print("NO");
    }
}