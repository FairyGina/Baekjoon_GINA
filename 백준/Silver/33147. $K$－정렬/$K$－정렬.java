import java.io.*;
import java.util.*;
class Main{
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
        
        k=gcd(n,k);
        String as="YES";
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            if((Integer.parseInt(st.nextToken())-i)%k!=0){
                as="NO";
            }
        }
        System.out.print(as);
    }
}