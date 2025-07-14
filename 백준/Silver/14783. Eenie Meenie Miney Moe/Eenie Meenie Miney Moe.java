import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),l=Integer.parseInt(st.nextToken());
        int[] rm=new int[l];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<l;i++){
            rm[i]=Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        int ct=0,rd=0;
        while(n>1){
            rd=(rd+rm[ct++%l]-1)%n--;
            arr.remove(rd);
        }
        System.out.print(arr.get(0));
    }
}