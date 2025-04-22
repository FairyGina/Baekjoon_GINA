import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder as=new StringBuilder();
        as.append('<');
        StringTokenizer s=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(s.nextToken()),k=Integer.parseInt(s.nextToken()),id=0;
        LinkedList<Integer> lk=new LinkedList<>();
        for(int i=1;i<=n;i++){
            lk.add(i);
        }
        while(!lk.isEmpty()){
            int sz=lk.size();
            id=(id+k)%sz-1;
            if(id<0) id+=sz;
            as.append(lk.remove(id)).append(", ");
        }
        as.delete(as.length()-2,as.length());
        as.append('>');
        O.write(as+"\n");
        O.flush();
    }
}