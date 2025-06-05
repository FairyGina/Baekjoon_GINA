import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),r=0;

        int[] box=new int[n];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            box[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<m;i++){
            int b=Integer.parseInt(st.nextToken());
            for(int j=0;j<n;j++){
                if(b<=box[j]){
                    box[j]-=b;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            r+=box[i];
        }
        System.out.print(r);
    }
}