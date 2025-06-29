import java.io.*;
//import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            String s=I.readLine().toUpperCase(),ans="Yes\n";
            int lt=s.length(),r=lt/2,l=r-1;
            if(lt%2!=0) r++;
            while(l>=0){
                if(s.charAt(l--)!=s.charAt(r++)){
                    ans="No\n";
                    break;
                }
            }
            as.append(ans);
        }
        System.out.print(as);
    }
}