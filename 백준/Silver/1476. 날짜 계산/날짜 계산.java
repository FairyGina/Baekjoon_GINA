import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
    
        StringTokenizer st=new StringTokenizer(I.readLine());
        int[] cur=new int[3],fut=new int[3],year={16,29,20};

        cur[0]=Integer.parseInt(st.nextToken());
        cur[1]=Integer.parseInt(st.nextToken());
        cur[2]=Integer.parseInt(st.nextToken());

        int ct=1;
        while(cur[0]!=1||cur[1]!=1||cur[2]!=1){
            for(int i=0;i<3;i++){
                if(cur[i]==1) cur[i]=year[i];
            }
            int mn=cur[0]-1;
            mn=Math.min((Math.min(mn,cur[1]-1)),cur[2]-1);
            ct+=mn;
            for(int i=0;i<3;i++){
                fut[i]=cur[i]-mn;
            }
            cur=fut.clone();
        }
        System.out.print(ct);
    }
}