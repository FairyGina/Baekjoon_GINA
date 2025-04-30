import java.io.*;
class Main{
    public static boolean iP(int n){
        if(n%2==0||n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int sz=246913;
        int[] nu=new int[sz];
        nu[1]=1; nu[2]=2; nu[3]=3; nu[4]=3;
        for(int i=5;i<sz;i++){
            if(iP(i)) nu[i]=nu[i-1]+1;
            else nu[i]=nu[i-1];
        }
        int n=Integer.parseInt(I.readLine());
        while(n!=0){
            as.append(nu[2*n]-nu[n]).append('\n');
            n=Integer.parseInt(I.readLine());
        }
        System.out.println(as);
    }
}