import java.io.*;
class Solution{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int ti=Integer.parseInt(I.readLine());
        for(int t=1;t<=ti;t++){
            String mem=I.readLine();
            int len=mem.length();
            boolean[] bit=new boolean[len],first=new boolean[len];

            for(int i=0;i<len;i++){
                if(mem.charAt(i)=='1') bit[i]=true;
            }
            int res=0;
            for(int i=0;i<len;i++){
                if(first[i]!=bit[i]){
                    for(int j=i;j<len;j++){
                        first[j]=!first[j];
                    }
                    res++;
                }
            }


            as.append('#').append(t).append(' ').append(res).append('\n');
        }
        System.out.print(as);
    }
}