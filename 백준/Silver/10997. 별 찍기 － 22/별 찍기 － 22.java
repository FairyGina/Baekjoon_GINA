import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int n=Integer.parseInt(I.readLine());

        if(n==1){
            System.out.print("*");
            return;
        }

        int a=n*4-3;
        char[][] star=new char[a][a];
        for(char[] i:star){
            Arrays.fill(i,'*');
        }


        int start=1,end=a-1;
        for(int i=1,j=a-2;i<j;i+=2,j-=2){
            Arrays.fill(star[i],i+2,j,' ');
            Arrays.fill(star[j],i,j,' ');
            star[start-1][i]=' ';
            star[start][i]=' ';

            for(int k=i;k<end;k++){
                star[k][i]=' ';
                star[k][j]=' ';
            }
            start+=2; end-=2;
        }

        as.append(star[a-1]).append('\n');
        as.append("*").append('\n');

        for(char[] i:star){
            as.append(i).append('\n');
        }
        as.delete(as.length()-1,as.length());
        System.out.print(as);
    }
}