import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int n=Integer.parseInt(I.readLine());
        int len=4*n-3;
        int start=0,end=len-1;

        char[][] square=new char[len][len];
        
        for(char[] c:square){
            Arrays.fill(c,' ');
        }

        for(int i=0,j=end;i!=j;i+=2,j-=2){
            Arrays.fill(square[i],start,end,'*');
            Arrays.fill(square[j],start,end,'*');
            for(int k=start;k<=end;k++){
                square[k][start]='*';
                square[k][end]='*';
            }
            start+=2; end-=2;
        }

        square[start][start]='*';
        for(char[] c:square){
            as.append(c).append('\n');
        }

        System.out.print(as);
    }
}