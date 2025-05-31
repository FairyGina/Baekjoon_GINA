import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        int l=n-5;
        for(int i=1;i<=l;i+=6){
            int lm=i+6;
            for(int j=i;j<lm;j++){
                as.append(j).append(' ');
            }
            as.append("Go! ");
        }
        l=n/6*6; n%=6;
        if(n!=0){
            for(int i=l+1;i<=l+n;i++){
                as.append(i).append(' ');
            }
            as.append("Go! ");
        }
        System.out.print(as);
    }
}