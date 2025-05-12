import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int n=Integer.parseInt(I.readLine()),p=8001;

        double nu=0;
        int[] nb=new int[n];
        int[][] os=new int[p][2];
        for(int i=0;i<n;i++){
            nb[i]=Integer.parseInt(I.readLine());
            nu+=nb[i];
            os[nb[i]+4000][0]++;
            os[nb[i]+4000][1]=nb[i];
        }
        nu/=n;
        as.append(Math.round(nu)).append('\n');

        Arrays.sort(nb);
        as.append(nb[n/2]).append('\n');
        int ag=nb[n-1]-nb[0];
        
        int mx=0;
        for(int i=0;i<p;i++){
            if(mx<os[i][0]) mx=os[i][0];
        }

        ArrayList<Integer> mo=new ArrayList<>(n);
        for(int i=0;i<p;i++){
            if(mx==os[i][0]) mo.add(os[i][1]);
        }
        Collections.sort(mo);
        int a=mo.get(0);
        if(mo.size()<2) mx=a;
        else{
            int b=mo.get(1);
            if(mo.size()<3) mx=a>b?a:b;
            else mx=mo.size()<2?a:b;
        }
        
        as.append(mx).append('\n');
        as.append(ag).append('\n');
        
        System.out.println(as);
    }
}