import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        int[] nb=new int[n],mk=new int[n];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            nb[i]=Integer.parseInt(st.nextToken());
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        System.arraycopy(nb, 0, mk, 0, n);
        Arrays.sort(mk);
        int id=0;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(mk[i])){
                hm.put(mk[i],id++);
            }
        }
        for(int i=0;i<n;i++){
            int tp=hm.get(nb[i]);
            as.append(tp).append(' ');
        }
        System.out.print(as);
    }
}