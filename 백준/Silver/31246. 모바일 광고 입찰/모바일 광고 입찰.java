import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken())-1;
        int[] nb=new int[n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(I.readLine());
            nb[i]=-Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nb);
        System.out.print(nb[k]<1?0:nb[k]);
    }
}