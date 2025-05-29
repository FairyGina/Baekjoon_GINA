import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(I.readLine());
        StringTokenizer st=new StringTokenizer(I.readLine());
        int r=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());
        if(n==3){
            if(r==2&&c==2) System.out.print(1);
            else System.out.print(4);
        }else{
            if(n%2==1&&(r+c)%2==0){
                System.out.print(n*n/2+1);
            }else{
                System.out.print(n*n/2);
            }
        }
    }
}