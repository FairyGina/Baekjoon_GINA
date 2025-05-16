import java.io.*;
import java.util.*;
class Main{
    static StringBuilder as=new StringBuilder();
    static int n,m,sz;
    static int[] nb;
    static ArrayList<Integer> arr;
    static Set<Integer> hs;

    static void seq(int id,int p){
        if(id==m){
            for(int i:nb) as.append(i).append(' ');
            as.append('\n');
            return;
        }
        for(int i=p;i<sz;i++){
            nb[id]=(int)arr.get(i);
            seq(id+1,i);
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st=new StringTokenizer(I.readLine());
        n=Integer.parseInt(st.nextToken()); m=Integer.parseInt(st.nextToken());

        hs=new HashSet<>();
        arr=new ArrayList<>();
        nb=new int[m];

        st=new StringTokenizer(I.readLine());
        
        for(int i=0;i<n;i++){
            int it=Integer.parseInt(st.nextToken());
            if(hs.add(it)) arr.add(it);
        }
        sz=hs.size();
        Collections.sort(arr);

        seq(0,0);
        System.out.println(as);
    }
}