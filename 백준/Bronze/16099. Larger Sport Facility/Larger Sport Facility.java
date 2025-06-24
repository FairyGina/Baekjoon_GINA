import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            long a=Long.parseLong(st.nextToken())*Long.parseLong(st.nextToken()),b=Long.parseLong(st.nextToken())*Long.parseLong(st.nextToken());
            if(a>b) as.append("TelecomParisTech\n");
            else if(a<b) as.append("Eurecom\n");
            else as.append("Tie\n");
        }
        System.out.print(as);
    }
}