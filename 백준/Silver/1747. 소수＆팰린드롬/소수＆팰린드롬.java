import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int lm=1003002;
        boolean[] pm=new boolean[lm];
        for(int i=2;i<lm;i++){
            for(int j=i*2;j<lm;j+=i){
                pm[j]=true;
            }
        }

        List<Integer> arr=new ArrayList<>();
        for(int i=2;i<lm;i++){
            if(!pm[i]){
                String str1=String.valueOf(i);
                int ln=str1.length()/2;
                String s1=str1.substring(0,ln);
                StringBuilder s2=new StringBuilder(str1.substring(ln+str1.length()%2,str1.length())).reverse();

                if(s1.equals(s2.toString())) arr.add(i);
            }
        }

        int n=Integer.parseInt(I.readLine());
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=n){
                System.out.print(arr.get(i));
                break;
            }
        }
    }
}