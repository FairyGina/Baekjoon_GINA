import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        int[] cow=new int[n];
        for(int i=0;i<n;i++){
            cow[i]=Integer.parseInt(I.readLine());
        }
        int[] cp=cow.clone();
        Arrays.sort(cp);
        int r=0;
        for(int i=0;i<n;i++){
            if(cow[i]!=cp[i]) r++;
        }
        System.out.println(r==0?0:r-1);
    }
}