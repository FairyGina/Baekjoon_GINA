import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        char[] arr1=new char[n];
        String[] arr2=new String[n];

        Deque<String> dq=new ArrayDeque<>();

        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++) arr1[i]=st.nextToken().charAt(0);

        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++) arr2[i]=st.nextToken();

        for(int i=n-1;i>-1;i--) if(arr1[i]=='0') dq.offer(arr2[i]);

        int k=Integer.parseInt(I.readLine());
        st=new StringTokenizer(I.readLine());

        for(int i=0;i<k;i++){
            dq.offer(st.nextToken());
            as.append(dq.poll()).append(' ');
        }
        System.out.println(as);
    }
}