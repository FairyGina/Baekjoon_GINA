import java.io.*;
class Solution{
    static int minx,maxx,miny,maxy,count;
    static int[][] snail;
    public static boolean d(){
        if(miny>maxy) return false;
        for(int i=minx;i<=maxx;i++){
            snail[miny][i]=count++;
        }
        miny++;
        return s();
    }
    public static boolean s(){
        if(minx>maxx) return false;
        for(int i=miny;i<=maxy;i++){
            snail[i][maxx]=count++;
        }
        maxx--;
        return a();
    }
    public static boolean a(){
        if(miny>maxy) return false;
        for(int i=maxx;i>=minx;i--){
            snail[maxy][i]=count++;
        }
        maxy--;
        return w();
    }
    public static boolean w(){
        if(minx>maxx) return false;
        for(int i=maxy;i>=miny;i--){
            snail[i][minx]=count++;
        }
        minx++;
        return d();
    }
    static BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        for(int u=1;u<=t;u++){
            int n=Integer.parseInt(I.readLine());
            minx=0; maxx=n-1; miny=0; maxy=n-1;
            count=1;
            snail=new int[n][n];
            d();
            as.append('#').append(u).append('\n');
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    as.append(snail[i][j]).append(' ');
                }
                as.append('\n');
            }
        }
        System.out.println(as+"\n");
    }
}