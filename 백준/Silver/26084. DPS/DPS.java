import java.io.*;
import java.util.*;
class Main{
    static long cb(int m,int n){
        if(m<n) return 0;
        return ft(m,Math.max(n,m-n))/ft(Math.min(n,m-n),1);
    }
    static long ft(int m,int n){
        long r=1;
        for(int i=m;i>n;i--) r*=i;
        return r;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character,Integer> need=new HashMap<>(),name=new HashMap<>();
        String s=I.readLine();
        for(int i=0;i<3;i++){
            char c=s.charAt(i);
            if(need.containsKey(c)) need.put(c,need.get(c)+1);
            else need.put(c,1);
            name.put(c,0);
        }
        int n=Integer.parseInt(I.readLine());
        for(int i=0;i<n;i++){
            s=I.readLine();
            char c=s.charAt(0);
            if(name.containsKey(c)) name.put(c,name.get(c)+1);
        }
        long res=1;
        for(Map.Entry<Character,Integer>i:need.entrySet()){
            int nc=i.getValue(),ma=name.get(i.getKey());
            res*=cb(ma,nc);
        }
        System.out.println(res);
    }
}