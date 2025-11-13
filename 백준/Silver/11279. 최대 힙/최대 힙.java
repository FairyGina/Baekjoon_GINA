import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        for(int z=0; z<t;z++) {
            int tn=Integer.parseInt(I.readLine());
            if(tn==0){
                if(pq.isEmpty()) as.append(0).append('\n');
                else as.append(-pq.poll()).append('\n');
            }
            else pq.offer(-tn);
        }
        System.out.print(as);
    }
}