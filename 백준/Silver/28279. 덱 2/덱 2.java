import java.io.*;
import java.util.*;
class Main{
    static int[] dq=new int[2000001];
    static int front=1000000,end=1000000;
    static boolean et(){
        return end-front<1;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int f=Integer.parseInt(st.nextToken()),x=0;
            if(st.hasMoreTokens()) x=Integer.parseInt(st.nextToken());
            switch(f){
                case 1:
                    dq[--front]=x;
                    break;
                case 2:
                    dq[end++]=x;
                    break;
                case 3:
                    as.append(et()?-1:dq[front++]).append('\n');
                    break;
                case 4:
                    as.append(et()?-1:dq[--end]).append('\n');
                    break;
                case 5:
                    as.append(end-front).append('\n');
                    break;
                case 6:
                    as.append(et()?1:0).append('\n');
                    break;
                case 7:
                    as.append(et()?-1:dq[front]).append('\n');
                    break;
                default:
                    as.append(et()?-1:dq[end-1]).append('\n');
                    break;
            }
        }
        System.out.println(as);
    }
}