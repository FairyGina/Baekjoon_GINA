import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());
        int lm=a+b+c+1;
        int[] ct=new int[lm];
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                for(int k=1;k<=c;k++){
                    ct[i+j+k]++;
                }
            }
        }
        int max=0,id=0;
        for(int i=3;i<lm;i++){
            if(ct[i]>max){
                max=ct[i];
                id=i;
            }
        }
        System.out.print(id);
    }
}