import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        int lt=2*n-1;
        StringBuilder[] as=new StringBuilder[lt];
        for(int i=0;i<lt;i++){
            as[i]=new StringBuilder();
        }
        for(int i=0;i<n;i++){
            as[0].append('*');
        }
        int tp=lt-2;
        for(int i=0;i<tp;i++){
            as[0].append(' ');
        }
        for(int i=0;i<n;i++){
            as[0].append('*');
        }

        StringBuilder x=new StringBuilder("*");
        for(int i=0;i<n-2;i++){
            x.append(' ');
        }
        x.append('*');
        tp-=2;
        int lm=n-1;
        for(int i=1,j=tp;i<lm;i++,j-=2){
            for(int k=0;k<i;k++){
                as[i].append(' ');
            }
            as[i].append(x);
            for(int k=0;k<j;k++){
                as[i].append(' ');
            }
            as[i].append(x);
        }
        for(int i=1;i<n;i++){
            as[lm].append(' ');
        }
        as[lm].append(x);
        as[lm].delete(as[lm].length()-1,as[lm].length());
        as[lm].append(x);
        for(int i=n,j=n-2;i<lt;i++,j--){
            as[i].append(as[j]);
        }
        x=new StringBuilder();
        for(StringBuilder i:as){
            x.append(i).append('\n');
        }
        System.out.print(x);
    }
}