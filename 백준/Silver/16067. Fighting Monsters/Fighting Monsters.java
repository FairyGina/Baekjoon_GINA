import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,Integer>mid=new HashMap<>(30);
        HashMap<Integer,Integer>mval=new HashMap<>(30);
        int[] ct=new int[31];
        mid.put(0,1); mid.put(1,1);
        mval.put(1,1);
        int id=2;
        while(true){
            int n=mid.get(id-1)+mid.get(id-2);
            if(n>1000000) break;
            mid.put(id,n);
            mval.put(n,id++);
        }
        int n=Integer.parseInt(I.readLine());
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=1;i<=n;i++){
            int tn=Integer.parseInt(st.nextToken());
            if(mval.containsKey(tn)){
                id=mval.get(tn);
                ct[id]=i;
                if(ct[id-1]>0){
                    System.out.print(ct[id-1]+" "+ct[id]);
                    return;
                }else if(ct[id+1]>0){
                    System.out.print(ct[id]+" "+ct[id+1]);
                    return;
                }
                if(tn==1){
                    ct[0]=i; ct[1]=0;
                }
            }
        }
        System.out.print("impossible");
    }
}