import java.io.*;
import java.util.*;
class Main{
    static int[] arr;
    public static int bs(int s){
        int l=0,r=arr.length;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]<s) l=m+1;
            else if(arr[m]>s) r=m-1;
            else return m;
        }
        return 0;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        int[] num=new int[n];
        Set<Integer> a=new TreeSet<>();
        StringTokenizer s=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            int t=Integer.parseInt(s.nextToken());
            num[i]=t;
            a.add(t);
        }
        arr=a.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0;i<n;i++) O.write(bs(num[i])+" ");
        O.write("\n");
        O.flush();
    }
}