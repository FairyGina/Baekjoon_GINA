import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),day=0;
        int[] pl=new int[n];
        Arrays.fill(pl,k);
        while(pl[0]!=0){
            day++;
            for(int i=0;i<n;i++){
                pl[i]--;
            }
            for(int i=0;i<a;i++){
                pl[i]+=b;
            }
            Arrays.sort(pl);
        }
        System.out.print(day);
    }
}