import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        int[] arr=new int[12];
        while(n-->0){
            Arrays.fill(arr,0);
            int res=0;
            StringTokenizer st=new StringTokenizer(I.readLine());
            int nb=Integer.parseInt(st.nextToken());
            for(int i=0;i<12;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            for(int i=0;i<10;i++){
                L:for(int j=i+2;j<12;j++){
                    int l=j-1,max=Math.max(arr[i],arr[j]);
                    for(int k=i+1;k<=l;k++){
                        if(arr[k]<=max){
                            continue L;
                        }
                    }
                    res++;
                }
            }
            as.append(nb).append(' ').append(res).append('\n');
        }
        System.out.print(as);
    }
}