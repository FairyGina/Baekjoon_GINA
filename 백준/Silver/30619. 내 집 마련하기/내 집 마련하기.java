import java.io.*;
import java.util.*;
class Main{
    static int[] copy;
    static HashMap<Integer,Integer> hcp;
    static void swap(int i,int j){
        int t=copy[i];
        copy[i]=copy[j];
        copy[j]=t;
        hcp.put(copy[i],i);
        hcp.put(copy[j],j);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int n=Integer.parseInt(I.readLine());
        StringTokenizer st=new StringTokenizer(I.readLine());

        int[] home=new int[n];
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<n;i++){
            home[i]=Integer.parseInt(st.nextToken());
            hs.put(home[i],i);
        }

        int m=Integer.parseInt(I.readLine());
        while(m-->0){
            st=new StringTokenizer(I.readLine());
            copy=home.clone();
            int mn=Integer.parseInt(st.nextToken()),mx=Integer.parseInt(st.nextToken());
            
            hcp=new HashMap<>();
            
            for(int i=0;i<n;i++){
                hcp.put(home[i],i);
            }

            for(int i=mn;i<mx;i++){
                for(int j=i+1;j<=mx;j++){
                    if(hcp.get(i)>hcp.get(j)){
                        swap(hcp.get(i),hcp.get(j));
                    }
                }
            }

            for(int i:copy) as.append(i).append(' ');
            as.append('\n');
        }
        System.out.println(as);
    }
}