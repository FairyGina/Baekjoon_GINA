import java.io.*;
import java.util.*;

class Main{
    static int n,mc,l,r=0;
    static boolean[] vt,nvt;
    static int[] sta,lnk,add=new int[2];
    static int[][] mb;
    static ArrayList<Integer> rs=new ArrayList<>();
    static int num(int[] arr,int dt){
        if(dt==2){
            r+=mb[add[0]][add[1]];
        }
        else{
            for(int i=0;i<mc;i++){
                if(!nvt[i]){
                    nvt[i]=true;
                    add[dt]=arr[i];
                    num(arr,dt+1);
                    nvt[i]=false;
                }
            }
        }
        return r;
    }
    static void soc(int dt,int st){
        if(dt==mc){
            int id=0;
            for(int i=1;i<=n;i++){
                if(!vt[i]) lnk[id++]=i;
            }
            r=0;
            int sr=num(sta,0);
            r=0;
            int lr=num(lnk,0);
            rs.add(Math.abs(sr-lr));
            return;
        }
        for(int i=st;i<=n;i++){
            if(!vt[i]){
                vt[i]=true;
                sta[dt]=i;
                soc(dt+1,i+1);
                vt[i]=false;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        n=Integer.parseInt(I.readLine());
        mc=n/2;
        vt=new boolean[n+1]; nvt=new boolean[mc];
        mb=new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            for(int j=1;j<=n;j++){
                mb[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        l=n*(n-1);

        sta=new int[mc]; lnk=new int[mc];
        sta[0]=1; vt[1]=true;
        soc(1,2);

        int min=rs.get(0);

        for(int i:rs){
            if(i<min) min=i;
        }
        System.out.println(min);
    }
}