import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int t=Integer.parseInt(st.nextToken()),lt=Integer.parseInt(st.nextToken());
        int lm=lt/2,ct=t;
        while(t-->0){
            String s=I.readLine();
            int tp=lt;
            for(int i=0;i<lt;i++){
                if(s.charAt(i)=='X') tp--;
            }
            if(tp<=lm) ct--;
        }
        System.out.print(ct);
    }
}