import java.io.*;
import java.util.*;
class Main{
    static int x=0,y=0;
    static void mv(int id,int m){
        switch(id){
            case 0:
                x+=m;
                break;
            case 1:
                y-=m;
                break;
            case 2:
                x-=m;
                break;
            case 3:
                y+=m;
                break;
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        
        int ti=Integer.parseInt(st.nextToken()),t=Integer.parseInt(st.nextToken());
        int id=0,save=0,move;
        while(ti-->0){
            st=new StringTokenizer(I.readLine());
            int n=Integer.parseInt(st.nextToken());
            move=n-save;
            save=n;
            mv(id,move);
            if(st.nextToken().equals("right")) id=(id+1)%4;
            else id=(id+3)%4;
        }
        move=t-save;
        mv(id,move);
        System.out.print(x+" "+y);
    }
}