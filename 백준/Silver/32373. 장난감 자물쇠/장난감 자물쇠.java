import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());

        int[] loc=new int[n];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            int ti=Integer.parseInt(st.nextToken());
            loc[ti]=i;
        }
        String a="Yes";
        for(int i=0;i<n;i++){
            if(loc[i]!=i){
                if((loc[i]-i)%k!=0){
                    a="No";
                    break;
                }
            }
        }
        System.out.print(a);
    }
}