import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int t=Integer.parseInt(I.readLine());
        int[] arr=new int[10];
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            for(int i=0;i<10;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            as.append(arr[7]).append('\n');
        }
        System.out.print(as);
    }
}