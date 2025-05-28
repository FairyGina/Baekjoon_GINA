import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n;
        while((n=Integer.parseInt(I.readLine()))!=0){
            String[] name=new String[n];
            double[] key=new double[n];
            double max=0;
            for(int i=0;i<n;i++){
                StringTokenizer st=new StringTokenizer(I.readLine());
                name[i]=st.nextToken();
                key[i]=Double.parseDouble(st.nextToken());
                if(key[i]>max) max=key[i];
            }
            
            for(int i=0;i<n;i++){
                if(max==key[i]) as.append(name[i]).append(' ');
            }
            as.append('\n');
        }
        System.out.print(as);
    }
}