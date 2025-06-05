import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int ti=Integer.parseInt(st.nextToken()),t=Integer.parseInt(st.nextToken());
        int id=0,save=0,x=0,y=0,move;
        while(ti-->0){
            st=new StringTokenizer(I.readLine());
            int n=Integer.parseInt(st.nextToken());
            move=n-save;
            save=n;
            switch(id){
                case 0:
                    x+=move;
                    break;
                case 1:
                    y-=move;
                    break;
                case 2:
                    x-=move;
                    break;
                case 3:
                    y+=move;
                    break;
            }

            if(st.nextToken().equals("right")) id=(id+1)%4;
            else id=(id+3)%4;
        }
        move=t-save;
        switch(id){
            case 0:
                x+=move;
                break;
            case 1:
                y-=move;
                break;
            case 2:
                x-=move;
                break;
            case 3:
                y+=move;
                break;
        }
        System.out.print(x+" "+y);
    }
}