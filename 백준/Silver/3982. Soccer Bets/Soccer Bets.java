import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        HashMap<String,Integer> hm=new HashMap<>();
        int t=Integer.parseInt(I.readLine());
        int[] win=new int[16];
        while(t-->0){
            hm.clear();
            Arrays.fill(win,0);
            int id=0;
            for(int i=0;i<16;i++){
                StringTokenizer st=new StringTokenizer(I.readLine());
                String a=st.nextToken();
                if(!hm.containsKey(a)) hm.put(a,id++);
                String b=st.nextToken();
                if(!hm.containsKey(b)) hm.put(b,id++);
                int q=Integer.parseInt(st.nextToken()),p=Integer.parseInt(st.nextToken());
                if(q>p) win[hm.get(a)]++;
                else if(q<p) win[hm.get(b)]++;        
            }
            int max=0;
            for(int i=0;i<16;i++){
                if(win[i]>max){
                    max=win[i];
                    id=i;
                }
            }
            for(Map.Entry<String,Integer>et:hm.entrySet()){
                if(et.getValue()==id) as.append((et.getKey())).append('\n');
            }
        }
        System.out.print(as);
    }
}