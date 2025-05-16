import java.io.*;
import java.util.*;

class Main{
    static int n,max=-1000000000,min=1000000000;
    static int[] oper,nb;
    static void cal(int id,int cur){
        if(id==n){
            if(cur<min) min=cur;
            if(cur>max) max=cur;
            return;
        }
        for(int i=0;i<4;i++){
            if(oper[i]>0){
                oper[i]--;
                int res=cur;
                switch(i){
                    case 0:
                        res+=nb[id];
                        break;
                    case 1:
                        res-=nb[id];
                        break;
                    case 2:
                        res*=nb[id];
                        break;
                    default:
                        res/=nb[id];
                        break;
                }
                cal(id+1,res);
                oper[i]++;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        n=Integer.parseInt(I.readLine());
        nb=new int[n];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            nb[i]=Integer.parseInt(st.nextToken());
        }

        oper=new int[4];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<4;i++){
            oper[i]=Integer.parseInt(st.nextToken());
        }

        cal(1,nb[0]);
        System.out.println(max+"\n"+min);
    }
}