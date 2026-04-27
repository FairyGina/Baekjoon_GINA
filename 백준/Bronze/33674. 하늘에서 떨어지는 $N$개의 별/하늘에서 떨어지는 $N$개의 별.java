import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(s.nextToken()),d=Integer.parseInt(s.nextToken()),k=Integer.parseInt(s.nextToken());
        int[] st=new int[n],as=new int[n];
        int r=0;

        s=new StringTokenizer(I.readLine());
        
        for(int i=0;i<n;i++){
            st[i]=Integer.parseInt(s.nextToken());
        }

        for(int i=0;i<d-1;i++){
            for(int j=0;j<n;j++){
                as[j]+=st[j];
            }
            for(int j=0;j<n;j++){
                if(as[j]+st[j]>k){
                    as=new int[n];
                    r++;
                    break;
                }
            }
        }

        O.write(r+"\n");

        O.flush();
    }
}