import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        int[][] human=new int[n][2];
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            human[i][0]=Integer.parseInt(st.nextToken());
            human[i][1]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            int ct=1;
            for(int j=0;j<n;j++){
                if(human[i][0]<human[j][0]&&human[i][1]<human[j][1]) ct++;
            }
            as.append(ct).append(' ');
        }
        System.out.println(as);
    }
}