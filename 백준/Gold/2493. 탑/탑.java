import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        int[] top=new int[n+1],ans=new int[n];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=1;i<=n;i++){
            top[i]=Integer.parseInt(st.nextToken());
        }
        Stack<Integer>sk=new Stack<>();
        for(int i=n;i>-1;i--){
            while(!sk.isEmpty()){
                int x=sk.pop(),id=sk.pop();
                if(top[i]<x){
                    sk.push(id); sk.push(x);
                    break;
                }else{
                    ans[id-1]=i;
                }
            }
            sk.push(i); sk.push(top[i]);
        }
        for(int i:ans) as.append(i).append(' ');
        System.out.print(as);
    }
}