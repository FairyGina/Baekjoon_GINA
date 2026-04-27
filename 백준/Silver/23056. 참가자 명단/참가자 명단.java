import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
        int[] ct=new int[n+1];
        Map<String,Integer> hm=new HashMap<>();
        String s;
        while(!(s=I.readLine()).equals("0 0")){
            st=new StringTokenizer(s);
            int cl=Integer.parseInt(st.nextToken());
            if(ct[cl]<m){
                ct[cl]++;
                hm.put(st.nextToken(),cl);
            }
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<>(hm.entrySet());
        list.sort((a,b)->{
            int va=a.getValue(),vb=b.getValue();
            boolean aodd=va%2!=0,bodd=vb%2!=0;
            if(aodd&&!bodd) return -1;
            if(!aodd&&bodd) return 1;
            if(va!=vb) return Integer.compare(va,vb);
            int lena=a.getKey().length(),lenb=b.getKey().length();
            if(lena!=lenb) return Integer.compare(lena,lenb);
            return a.getKey().compareTo(b.getKey());
        });
        for(Map.Entry<String,Integer>et:list){
            as.append(et.getValue()).append(' ').append(et.getKey()).append('\n');
        }
        System.out.print(as);
    }
}