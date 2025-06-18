import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int[] nb=new int[51];
        int t=Integer.parseInt(I.readLine()),lm=2*t;
        while(t-->0){
            for(int ti=0;ti<10;ti++){
                StringTokenizer st=new StringTokenizer(I.readLine());
                for(int i=0;i<5;i++){
                    nb[Integer.parseInt(st.nextToken())]++;
                }
            }
        }
        for(int i=1;i<51;i++){
            if(nb[i]>lm) as.append(i).append(' ');
        }
        System.out.print(as.length()==0?-1:as);
    }
}