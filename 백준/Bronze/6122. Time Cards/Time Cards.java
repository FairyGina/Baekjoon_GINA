import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),t=Integer.parseInt(st.nextToken());
        int[] sv=new int[n+1],time=new int[n+1];

        for(int i1=0;i1<t;i1++){
            String[] arr=I.readLine().split(" ");
            int tt=Integer.parseInt(arr[2])*60+Integer.parseInt(arr[3]);
            int me=Integer.parseInt(arr[0]);
            if(arr[1].equals("START")){
                sv[me]=tt;
            }else{
                time[me]+=tt-sv[me];
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<n+1;i++){
            ans.append(time[i]/60).append(" ").append(time[i]%60).append('\n');
        }
        System.out.print(ans);
    }
}