import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(I.readLine());
        Set<String> set=new HashSet<>();
        for(int i=0;i<t;i++){
            set.add(I.readLine());
        }

        String[] arr=new String[set.size()];
        int idx=0;
        for(String str:set){
            arr[idx++]=str;
        }

        Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                int aln=a.length(), bln=b.length();
                if(aln!=bln) return aln-bln;
                return a.compareTo(b);
            }
        });

        StringBuilder ans=new StringBuilder();
        for(String str:arr) ans.append(str).append('\n');
        System.out.print(ans);
    }
}