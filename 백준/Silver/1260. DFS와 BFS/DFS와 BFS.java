import java.io.*;
import java.util.*;
class Main{
    static int n,m;
    static ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    public static void d(boolean[] b,int v){
        b[v]=true;
        System.out.print(v+" ");
        for(int nxt: a.get(v)) {
            if(b[nxt]==true) { continue; }
            d(b,nxt);
        }
    }
    public static void b(boolean[] b,int v){
        Queue<Integer> q=new LinkedList<>();
        q.offer(v);
        while(!q.isEmpty()){
            int x=q.poll();
            if(b[x]==true) continue;
            else{
                b[x]=true;
                System.out.print(x+" ");
                for(int i=0;i<a.get(x).size();i++){
                    if(b[a.get(x).get(i)]) continue;
                    else q.offer(a.get(x).get(i));
                }       
            }
        }
        for(int i=0;i<a.get(v).size();i++){
            if(b[a.get(v).get(i)]==true) continue;
            else b[a.get(v).get(i)]=true;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        n=Integer.parseInt(s.nextToken())+1;
        m=Integer.parseInt(s.nextToken());
        int v=Integer.parseInt(s.nextToken());
        boolean[] b=new boolean[n];
        int i=n,j=m;
        while(i-->0) a.add(new ArrayList<>());
        while(j-->0){
            s=new StringTokenizer(I.readLine());
            int q=Integer.parseInt(s.nextToken()),w=Integer.parseInt(s.nextToken());
            a.get(q).add(w);
            a.get(w).add(q);
        }
        for (ArrayList<Integer> row : a) Collections.sort(row);
        d(b,v);
        System.out.println("");
        Arrays.fill(b,false);
        b(b,v);
    }
}