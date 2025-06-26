import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken())-1;
        ArrayList<Integer> nb=new ArrayList<>();
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            nb.add(Integer.valueOf(st.nextToken()));
        }
        Collections.sort(nb);
        System.out.print(nb.get(k));
    }
}