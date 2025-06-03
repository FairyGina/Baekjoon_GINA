import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int n=Integer.parseInt(I.readLine());
            for(int i=2;i*i<=n;i++){
                int ct=0;
                while(n%i==0){
                    ct++;
                    n/=i;
                }
                if(ct>0){
                    as.append(i).append(' ').append(ct).append('\n');
                }   
            }
            if(n>1){
                as.append(n).append(' ').append(1).append('\n');
            }
        }
        System.out.print(as);
    }
}