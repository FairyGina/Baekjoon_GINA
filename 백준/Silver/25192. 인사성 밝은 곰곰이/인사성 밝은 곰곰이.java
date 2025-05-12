import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine()),r=0;
        HashSet<String> hs=new HashSet<>(n);
        for(int i=0;i<n;i++){
            String sg=I.readLine();
            if(sg.equals("ENTER")) hs=new HashSet<>(n);
            else if(hs.add(sg)) r++;
        }
        System.out.println(r);
    }
}