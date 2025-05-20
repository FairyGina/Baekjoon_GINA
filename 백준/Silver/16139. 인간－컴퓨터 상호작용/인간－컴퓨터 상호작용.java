import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringBuilder as=new StringBuilder();
        String s=I.readLine();
        int l=s.length();
        int[][] ap=new int[l+1][26];

        for(int i=1;i<=l;i++){
            System.arraycopy(ap[i-1],0,ap[i],0,26);
            ap[i][s.charAt(i-1)-97]++;
        }
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int id=st.nextToken().charAt(0)-97,a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
            as.append(ap[b+1][id]-ap[a][id]).append('\n');
        }

        System.out.println(as);
    }
}