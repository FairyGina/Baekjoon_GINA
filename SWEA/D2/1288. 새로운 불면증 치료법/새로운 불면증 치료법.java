import java.io.*;
import java.util.*;
class Solution{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringBuilder as=new StringBuilder();
        int ti=Integer.parseInt(I.readLine());
        for(int t=1;t<=ti;t++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int n=Integer.parseInt(st.nextToken());

            HashSet<Character> hs=new HashSet<>();
            for(char c='0';c<='9';c++){
                hs.add(c);
            }

            int r=0;
            while(!hs.isEmpty()){
                r+=n;
                String str=String.valueOf(r);
                int l=str.length();
                for(int i=0;i<l;i++){
                    hs.remove(str.charAt(i));
                }
            }
            
            as.append('#').append(t).append(' ').append(r).append('\n');
        }
        System.out.print(as);
    }
}