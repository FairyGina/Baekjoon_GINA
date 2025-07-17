import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x=Integer.parseInt(I.readLine());
        List<String[]> xa=new ArrayList<>();
        for(int i=0;i<x;i++){
            st=new StringTokenizer(I.readLine());
            xa.add(new String[]{st.nextToken(),st.nextToken()});
        }
        x=Integer.parseInt(I.readLine());
        List<String[]> ya=new ArrayList<>();
        for(int i=0;i<x;i++){
            st=new StringTokenizer(I.readLine());
            ya.add(new String[]{st.nextToken(),st.nextToken()});
        }
        x=Integer.parseInt(I.readLine());
        Map<String,Integer> hm=new HashMap<>();
        for(int i=0;i<x;i++){
            st=new StringTokenizer(I.readLine());
            for(int j=0;j<3;j++){
                hm.put(st.nextToken(),i);
            }
        }
        x=0;
        for(String[] ts:xa){
            String a=ts[0],b=ts[1];
            if (!hm.get(a).equals(hm.get(b))) {
                x++;
            }
        }
        for(String[] ts:ya){
            String a=ts[0],b=ts[1];
            if (hm.get(a).equals(hm.get(b))) {
                x++;
            }
        }
        System.out.println(x);
    }
}