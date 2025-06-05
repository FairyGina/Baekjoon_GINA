import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
        int[] arr=new int[n],d=new int[n],mk=new int[n];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            d[i]=Integer.parseInt(st.nextToken());
        }
        while(k-->0){
            for(int i=0;i<n;i++){
                mk[d[i]-1]=arr[i];
            }
            System.arraycopy(mk,0,arr,0,n);
        }
        for(int i:arr){
            as.append(i).append(' ');
        }
        System.out.print(as);
    }
}