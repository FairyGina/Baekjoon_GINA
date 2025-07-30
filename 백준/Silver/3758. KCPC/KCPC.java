import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
    
        StringBuilder as=new StringBuilder();
        int ti=Integer.parseInt(I.readLine());
        while(ti-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int n=Integer.parseInt(st.nextToken()),
            k=Integer.parseInt(st.nextToken()),
            t=Integer.parseInt(st.nextToken())-1,
            m=Integer.parseInt(st.nextToken());
            int[][] tsc=new int[n][k],team=new int[n][4];
            for(int i=0;i<n;i++){
                team[i][3]=i;
            }
            for(int mi=0;mi<m;mi++){
                st=new StringTokenizer(I.readLine());
                int i=Integer.parseInt(st.nextToken())-1,
                j=Integer.parseInt(st.nextToken())-1,
                s=Integer.parseInt(st.nextToken());
                if(s>tsc[i][j]) tsc[i][j]=s;
                team[i][1]++;
                team[i][2]=mi;
            }
            for(int i=0;i<n;i++){
                for(int j:tsc[i]){
                    team[i][0]+=j;
                }
            }
            Arrays.sort(team,new Comparator<int[]>() {
                public int compare(int[] a,int[] b){
                    if(a[0]!=b[0]) return b[0]-a[0];
                    if(a[1]!=b[1]) return a[1]-b[1];
                    return a[2]-b[2];
                }
            });
            for(int i=0;i<n;i++){
                if(t==team[i][3]) as.append(i+1).append('\n');
            }
        }
        System.out.print(as);
    }
}