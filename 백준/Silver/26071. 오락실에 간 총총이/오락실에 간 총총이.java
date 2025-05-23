import java.io.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine());
        boolean[] row=new boolean[n];
        boolean[] col=new boolean[n];

        int ct=0;
        int up=0,down=0,left=0,right=0;
        for(int i=0;i<n;i++){
            String s=I.readLine();
            for(int j=0;j<n;j++){
                if(s.charAt(j)=='G'){
                    ct++;
                    int y=i,x=j;
                    row[y]=true;
                    col[x]=true;
                    if(up<y) up=y;
                    if(down<(n-1-y)) down=n-1-y;
                    if(left<x) left=x;
                    if(right<(n-1-x)) right=n-1-x;
                }
            }
        }

        int rowct=0,colct=0;
        for(int i=0;i<n;i++){
            if(row[i]) rowct++;
            if(col[i]) colct++; 
        }

        int res=0;
        if(rowct>1) res+=Math.min(up,down);
        if(colct>1) res+=Math.min(left,right);

        System.out.print(res);
    }
}