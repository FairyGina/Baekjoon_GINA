import java.io.*;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine()),res=0;
        char[] tr=new char[n];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            tr[i]=st.nextToken().charAt(0);
        }
        char c=I.readLine().charAt(0);
        for(int i=0;i<n;i++){
            if(tr[i]==c) res++;
        }
        System.out.print(res);
    }
}