import java.io.*;
class Main{
    static int t;
    static int[] candy;
    static boolean ch(){
        for(int i=0;i<t;i++){
            if(candy[i]!=candy[(i+1)%t]) return true;
        }
        return false;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        while((t=Integer.parseInt(I.readLine()))!=0){
            candy=new int[t];
            int[] make=new int[t];
            for(int i=0;i<t;i++){
                candy[i]=Integer.parseInt(I.readLine())/2;
            }
            int ct=0;
            while(ch()){
                ct++;
                System.arraycopy(candy,0,make,0,t);
                for(int i=0;i<t;i++){
                    int id=(i+1)%t;
                    make[id]+=candy[i];
                    if(make[id]%2!=0) make[id]++;
                    make[id]/=2;
                }
                System.arraycopy(make,0,candy,0,t);
            }
            as.append(ct).append(' ').append(candy[0]*2).append('\n');
        }
        System.out.print(as);
    }
}