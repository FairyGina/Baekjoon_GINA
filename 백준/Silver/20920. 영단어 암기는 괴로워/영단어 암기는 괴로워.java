import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());

        String[] ip=new String[n];
        HashMap<String,Integer> hs=new HashMap<>();
        int[][] info=new int[n+1][3];
        int sz=0;

        for(int i=0;i<n;i++){
            String s=I.readLine();
            int l=s.length();
            if(l<m) continue;
            if(hs.containsKey(s)){
                int id=hs.get(s);
                info[id][0]++;
            }else{
                hs.put(s,sz);
                info[sz][0]++;
                info[sz][1]=l;
                info[sz][2]=sz;
                ip[sz++]=s;
            }
        }

        Arrays.sort(info,(a,b)->Integer.compare(b[0],a[0]));

        int id=0;
        while(id<sz){
            int mx=info[id][0];
            ArrayList<int[]>arc=new ArrayList<>();
            while(id<sz){
                if(mx==info[id][0]){
                    arc.add(new int[]{info[id][1],info[id][2]});
                    id++;
                }else break;
            }
            Collections.sort(arc,(a,b)->Integer.compare(b[0],a[0]));
            for(int i=10;i>0;i--){
                ArrayList<String> op=new ArrayList<>();
                for(int[] p:arc){
                    int c=p[0],dx=p[1];
                    if(c==i) op.add(ip[dx]);
                }
                Collections.sort(op);
                for(String s:op) O.write(s+'\n');
            }
        }        
        O.flush();
    }
}