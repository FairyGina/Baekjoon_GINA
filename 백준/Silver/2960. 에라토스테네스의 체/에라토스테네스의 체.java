import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        boolean[] et=new boolean[1001];

        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),ct=0,start=2;

        while(start<=n){
            if(!et[start]){
                for(int i=start;i<=n;i+=start){
                    if(!et[i]){
                        if(++ct==k){
                            System.out.print(i);
                            break;
                        }
                        et[i]=true;
                    }
                }
            }
            start++;
        }
    }
}