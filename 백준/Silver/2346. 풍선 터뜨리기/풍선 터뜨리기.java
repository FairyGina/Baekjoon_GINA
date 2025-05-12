import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        ArrayList<int[]> bal=new ArrayList<>(n);
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=1;i<=n;i++){
            bal.add(new int[]{Integer.parseInt(st.nextToken()),i});
        }
        int id=0;
        while(n>1){
            int[] bl=bal.get(id);
            int mv=bl[0];
            as.append(bl[1]).append(' ');
            bal.remove(id--);
            id=mv%--n+id;
            if(mv<0) id++;
            if(id<0) id=n+id;
            else if(id>=n) id-=n;
        }
        as.append(bal.get(0)[1]);
        System.out.println(as);
    }
}