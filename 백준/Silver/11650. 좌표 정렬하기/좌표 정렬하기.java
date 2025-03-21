import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        int[][] num=new int[n][2];
        for(int i=0;i<n;i++){
            StringTokenizer s=new StringTokenizer(I.readLine());
            num[i][0]=Integer.parseInt(s.nextToken());
            num[i][1]=Integer.parseInt(s.nextToken());
        }
        Arrays.sort(num,(a,b)->{
            if(a[0]!=b[0]) {
                return Integer.compare(a[0],b[0]);
            } else {
                return Integer.compare(a[1],b[1]);
            }
        });
        for(int i=0;i<n;i++) O.write(num[i][0]+" "+num[i][1]+"\n");
        O.flush();
    }
}