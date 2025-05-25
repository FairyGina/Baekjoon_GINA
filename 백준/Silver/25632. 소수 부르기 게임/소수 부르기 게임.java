import java.io.*;
import java.util.*;
class Main{
    static int[] pk=new int[170];
    static void pm(){
        int id=2;
        pk[0]=2;
        pk[1]=3;
        L: for(int i=5;i<1019;i++){
            if(i%2==0||i%3==0) continue; 
            for(int j=5;j*j<=i;j+=6){
                if(i%j==0||i%(j+2)==0) continue L;
            }
            pk[id++]=i;
        }
    }
    static void able(int a,int b,TreeSet<Integer>hs){
        int id=0;
        for(int i=a;i<=b;){
            if(pk[id]>i) i++;
            else if(pk[id]<i) id++;
            else{
                hs.add(i);
                i++; id++;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Integer> ts=new TreeSet<>(),js=new TreeSet<>();
        pm();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
        able(a,b,ts);
        st=new StringTokenizer(I.readLine());
        int c=Integer.parseInt(st.nextToken()),d=Integer.parseInt(st.nextToken());
        able(c,d,js);
        boolean win=false;
        while(true){
            boolean bl=false;
            if(ts.isEmpty()){
                win=true;
                break;
            }else if(js.isEmpty()){
                win=false;
                break;
            }

            int pv=ts.first();
            L:for(int i:ts){
                for(int j:js){
                    if(i==j){
                        pv=i;
                        bl=true;
                        break L;
                    }
                }
            }
            ts.remove(pv);
            if(bl==true) js.remove(pv);
            bl=false;
            if(js.isEmpty()){
                win=false;
                break;
            }else if(ts.isEmpty()){
                win=true;
                break;
            }
            pv=js.first();
            L:for(int i:js){
                for(int j:ts){
                    if(i==j){
                        pv=i;
                        bl=true;
                        break L;
                    }
                }
            }
            js.remove(pv);
            if(bl==true) ts.remove(pv);
        }
        System.out.print(win==true?"yj":"yt");
    }
}