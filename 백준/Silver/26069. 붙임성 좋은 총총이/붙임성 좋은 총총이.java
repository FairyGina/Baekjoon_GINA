import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine()),r=1;
        HashSet<String> hs=new HashSet<>(n);
        hs.add("ChongChong");
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            String a=st.nextToken(),b=st.nextToken();
            if(hs.contains(a)^hs.contains(b)){
                r++;
                hs.add(a); hs.add(b);
            }
        }
        System.out.println(r);
    }
}