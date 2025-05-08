import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        String p=I.readLine(),t=I.readLine();
        int[] ap=new int[26];
        while(--n>-1){
            int pc=p.charAt(n)-97,pt=t.charAt(n)-97;
            ap[pc]++;
            if(pc!=pt) ap[pt]++;
        }
        Arrays.sort(ap);
        System.out.println(ap[25]);
    }
}