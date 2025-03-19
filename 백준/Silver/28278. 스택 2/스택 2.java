import java.io.*;
import java.util.*;
class Main{
    static int t=-1;
    static int[] st=new int[1000000];
    public static void push(int x){
        t++;
        st[t]=x;
    }
    public static int pop(){
        if(t<0) return t;
        else return st[t];
    }
    public static int se(){
        if(t<0) return 1;
        else return 0;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            String s=I.readLine();
            int o,x=0;
            if(s.contains(" ")){
                StringTokenizer sz= new StringTokenizer(s);
                o=Integer.parseInt(sz.nextToken());
                x=Integer.parseInt(sz.nextToken());
            }
            else o=Integer.parseInt(s);
            switch(o){
                case 1: push(x); break;
                case 2: O.write(pop()+"\n"); if(t>-1) t--; break;
                case 3: O.write(t+1+"\n"); break;
                case 4: O.write(se()+"\n"); break;
                default: O.write(pop()+"\n");
            }
        }
        O.flush();
    }
}