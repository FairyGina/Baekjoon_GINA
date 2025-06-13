import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            st=new StringTokenizer(I.readLine());
            int c=Integer.parseInt(st.nextToken())-Integer.parseInt(st.nextToken());
            if(c<0){
                arr.add(-c);
            }else k--;
        }
        Collections.sort(arr);
        System.out.print(k<1?0:arr.get(k-1));
    }
}