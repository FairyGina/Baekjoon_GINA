import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        List<String> arr1=new ArrayList<>(),arr2=new ArrayList<>(),arr3=new ArrayList<>();
        StringBuilder ans=new StringBuilder();

        int t1=Integer.parseInt(I.readLine());
        for(int i1=0;i1<t1;i1++){
            arr1.clear(); arr2.clear(); arr3.clear();
            int t2=Integer.parseInt(I.readLine());
            for(int i2=0;i2<t2;i2++){
                String ip=I.readLine();
                int ln=ip.length();
                String s1=ip.substring(ln-7),s2=ip.substring(0,ln-8);
                if(s1.equals("(shirt)")) arr1.add(s2);
                else if(s1.equals("(pants)")) arr2.add(s2);
                else arr3.add(s2);
            }
            int a=arr1.size(),b=arr2.size(),c=arr3.size();
            int ln=Math.min(Math.min(a,b),c)-1;
            for(int i=ln;i>-1;i--){
                ans.append(arr1.get(--a)).append(", ").append(arr2.get(--b)).append(", ").append(arr3.get(--c)).append('\n');
            }
            ans.append('\n');
        }
        System.out.print(ans);
    }
}