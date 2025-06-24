import java.io.*;
//import java.util.*;
class Main{
    static boolean bl=true;
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        long res=0;
        int len=Integer.parseInt(I.readLine());
        String s=I.readLine();
        int[] cn=new int[len+1],on=new int[len+1],wn=new int[len+1];
        for(int i=0;i<len;i++){
            cn[i+1]=cn[i];
            on[i+1]=on[i];
            wn[i+1]=wn[i];
            if(s.charAt(i)=='C') cn[i+1]++;
            else if(s.charAt(i)=='O') on[i+1]++;
            else wn[i+1]++;
        }
        int[] ores=new int[len+1];
        for(int i=1;i<=len;i++){
            ores[i]=ores[i-1];
            if(on[i]>on[i-1]){
                ores[i]+=wn[len]-wn[i];
            }
        }
        long tp=0;
        for(int i=1;i<=len;i++){
            res=tp;
            if(cn[i]>cn[i-1]){
                res+=ores[len]-ores[i];
            }
            tp=res;
        }
        System.out.print(res);
    }
}