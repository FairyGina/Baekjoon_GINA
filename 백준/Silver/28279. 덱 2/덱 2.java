import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        Deque<Integer> dq=new ArrayDeque<>(1000000);
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int f=Integer.parseInt(st.nextToken()),x=0;
            if(st.hasMoreTokens()) x=Integer.parseInt(st.nextToken());
            switch(f){
                case 1:
                    dq.offerFirst(x);
                    break;
                case 2:
                    dq.offerLast(x);
                    break;
                case 3:
                    as.append(dq.isEmpty()?-1:dq.poll()).append('\n');
                    break;
                case 4:
                    as.append(dq.isEmpty()?-1:dq.pollLast()).append('\n');
                    break;
                case 5:
                    as.append(dq.size()).append('\n');
                    break;
                case 6:
                    as.append(dq.isEmpty()?1:0).append('\n');
                    break;
                case 7:
                    as.append(dq.isEmpty()?-1:dq.peek()).append('\n');
                    break;
                default:
                    as.append(dq.isEmpty()?-1:dq.peekLast()).append('\n');
                    break;
            }
        }
        System.out.println(as);
    }
}