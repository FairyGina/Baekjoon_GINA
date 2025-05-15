import java.io.*;
import java.util.*;
class Main{
    static int[] win,lose,c;
    static int fct(int[] a,int[] b){
        int ct=0;
        for(int i=3;i>-1;i--){
            for(int j=3;j>-1;j--){
                if(a[i]>b[j]) ct++;
            }
        }
        return ct;
    }
    static boolean non(int id){
        for(int i=0;i<10;i++){
            if(id<3&&non(id+1)) return true;
            if((fct(c,win)>fct(win,c))&&(fct(c,lose)<fct(lose,c))) return true;
            c[id]++;
        }
        c[id]=1;
        return false;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int[] a=new int[4],b=new int[4];
            c=new int[4];
            Arrays.fill(c,1);
            StringTokenizer st=new StringTokenizer(I.readLine());
            for(int i=0;i<4;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            for(int i=0;i<4;i++){
                b[i]=Integer.parseInt(st.nextToken());
            }
            if(fct(a,b)>fct(b,a)){
                win=a; lose=b;
            } else{
                win=b; lose=a;
            }
            as.append(non(0)?"yes":"no").append('\n');
        }
        System.out.println(as);
    }
}