import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(I.readLine());
        String as="";
        char c='5';
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            String s=st.nextToken();
            char tc=st.nextToken().charAt(0);
            if(tc<c){
                as=s;
                c=tc;
            }
        }
        System.out.print(as);
    }
}