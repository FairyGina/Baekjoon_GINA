import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer>dq=new LinkedList<>();
        Stack<Integer>st=new Stack<>();

        int n=Integer.parseInt(I.readLine());

        StringTokenizer s=new StringTokenizer(I.readLine());

        for(int i=1;i<=n;i++){
            dq.add(Integer.valueOf(s.nextToken()));
        }
        int p=1;

        for(int i=1;i<=n;i++){
            if(dq.getFirst()!=p){
                st.add(dq.pollFirst());
            }else{
                dq.pollFirst();
                p++;
            }
            while(!st.isEmpty()){
                if(st.peek()!=p){
                    break;
                }else{
                    st.pop();
                    p++;
                }
            }
        }
        O.write((p>n)?"Nice":"Sad"+"\n");
        O.flush();
    }
}