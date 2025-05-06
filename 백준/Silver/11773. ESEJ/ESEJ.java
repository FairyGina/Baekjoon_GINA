import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        StringTokenizer st=new StringTokenizer(I.readLine());
        int mx=Math.max(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())/2);
        int q=0,w=0,e=0,r=0,ct=1;
        char[] al=new char[5];

        Arrays.fill(al,'a');

        L:for(;q<26;q++){
            al[2]='a';
            w=0;
            for(;w<26;w++){
                al[1]='a';
                e=0;
                for(;e<26;e++){
                    al[0]='a';
                    r=0;
                    for(;r<26;r++){
                        if(ct>mx) break L;
                        as.append(String.valueOf(al)).append(' ');
                        al[0]++;
                        ct++;
                    }
                    al[1]++;
                }
                al[2]++;
            }
            al[3]++;
        }
        
        System.out.println(as);
    }
}