import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),q=Integer.parseInt(st.nextToken());
        int[] nb=new int[n],num=new int[n+1];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            nb[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nb);
        for(int i=0;i<n;i++){
            num[i+1]+=nb[i]+num[i];
        }
        while(q-->0){
            st=new StringTokenizer(I.readLine());
            int res=-num[Integer.parseInt(st.nextToken())-1]+num[Integer.parseInt(st.nextToken())];
            as.append(res).append('\n');
        }
        System.out.print(as);
    }
}