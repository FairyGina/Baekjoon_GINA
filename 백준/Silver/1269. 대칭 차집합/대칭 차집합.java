import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> s1=new HashSet<>(),s2=new HashSet<>();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            s1.add(st.nextToken());
        }
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<m;i++){
            String s=st.nextToken();
            if(s1.contains(s)){
                s1.remove(s);
            } else{
                s2.add(s);
            }
        }
        O.write((s1.size()+s2.size())+"\n");
        O.flush();
    }
}