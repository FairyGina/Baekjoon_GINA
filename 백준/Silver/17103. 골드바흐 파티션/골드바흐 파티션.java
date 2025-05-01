import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        boolean[] b=new boolean[1000001];
        int t=Integer.parseInt(I.readLine()),pi=0;
        int[] pn=new int[78498];
        b[0]=b[1]=true;
        for(int i=2;i*i<1000001;i++){
            if(!b[i]){
                for(int j=i*i;j<1000001;j+=i){
                    b[j]=true;
                }
            }
        }
        for(int i=0;i<1000001;i++){
            if(!b[i]) pn[pi++]=i;
        }
        while(t-->0){
            int n=Integer.parseInt(I.readLine()),r=0,l=n/2;
            for(int i=0;i<pi&&pn[i]<=l;i++){
                if(!(b[n-pn[i]])) r++;
            }
            as.append(r).append("\n");
        }
        System.out.println(as);
    }
}