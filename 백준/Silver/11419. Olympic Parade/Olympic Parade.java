import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),id=0;
        int[] ct=new int[n];
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            String tn=I.readLine();
            if(!hm.containsKey(tn)){
                hm.put(tn,id++);
            }
            ct[hm.get(tn)]++;
        }
        L:for(int i=0;i<id;i++){
            if(ct[i]%k!=0){
                for(Map.Entry<String,Integer>et:hm.entrySet()){
                    if(i==et.getValue()){
                        System.out.print(et.getKey());
                        break L;
                    }
                }
            }
        }
    }
}