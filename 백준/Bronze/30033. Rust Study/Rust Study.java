import java.io.*;
import java.util.StringTokenizer;
class Main{
    static BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine()),r=0;
        int[] sd=new int[n];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            sd[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            if(Integer.parseInt(st.nextToken())>=sd[i]) r++;
        }
        System.out.println(r+"\n");
    }
}