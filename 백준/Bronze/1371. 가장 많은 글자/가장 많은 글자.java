import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int[] ap=new int[26];
        String s;
        while((s=I.readLine())!=null){
            StringTokenizer st=new StringTokenizer(s);
            while(st.hasMoreTokens()){
                String ts=st.nextToken();
                int lm=ts.length();
                for(int i=0;i<lm;i++){
                    ap[ts.charAt(i)-97]++;
                }
            }
        }
        int max=ap[0];
        for(int i=1;i<26;i++){
            if(ap[i]>max){
                max=ap[i];
            }
        }
        for(int i=0;i<26;i++){
            if(ap[i]==max){
                as.append((char)(i+97));
            }
        }

        System.out.print(as);
    }
}