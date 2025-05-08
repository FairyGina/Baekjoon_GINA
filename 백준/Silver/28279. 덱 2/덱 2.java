import java.io.*;
import java.util.*;
class Main{
    static Deque<Integer> dq=new ArrayDeque<>(1000000);
    static boolean et(){
        return dq.isEmpty();
    }
    static int sz(){
        return dq.size();
    }
    static void fo(int x){
        dq.offerFirst(x);
    }
    static void eo(int x){
        dq.offerLast(x);
    }
    static int fp(){
        return et()?-1:dq.poll();
    }
    static int ep(){
        return et()?-1:dq.pollLast();
    }
    static int fl(){
        return et()?-1:dq.peek();
    }
    static int el(){
        return et()?-1:dq.peekLast();
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
                    fo(x);
                    break;
                case 2:
                    eo(x);
                    break;
                case 3:
                    as.append(fp()).append('\n');
                    break;
                case 4:
                    as.append(ep()).append('\n');
                    break;
                case 5:
                    as.append(sz()).append('\n');
                    break;
                case 6:
                    as.append(et()==true?1:0).append('\n');
                    break;
                case 7:
                    as.append(fl()).append('\n');
                    break;
                default:
                    as.append(el()).append('\n');
                    break;
            }
        }
        System.out.println(as);
    }
}