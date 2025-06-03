import java.io.*;
class Main{
    static int r,n;
    static void dfs(int nb){
        if(nb>n) return;
        r=Math.max(r,nb);
        dfs(nb*10+4);
        dfs(nb*10+7);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(I.readLine());
        dfs(4); dfs(7);
        System.out.print(r);
    }
}