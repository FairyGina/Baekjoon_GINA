import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(I.readLine());
        boolean b=true;
        for(int i=0;i<n;i++){
            int ti=Integer.parseInt(st.nextToken());
            if((ti-i)%k!=0){
                b=false;
                break;
            }
        }
        System.out.print(b?"Yes":"No");
    }
}