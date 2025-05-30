import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int r=0;
            for(int i=0;i<3;i++){
                r+=Integer.parseInt(st.nextToken())%2;
            }
            as.append(r>1?"B":"R").append('\n');
        }
        System.out.print(as);
    }
}