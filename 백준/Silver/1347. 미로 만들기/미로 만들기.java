import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        char[][] miro=new char[101][101];
        for(int i=0;i<101;i++){
            Arrays.fill(miro[i],'#');
        }
        int[] my={1,0,-1,0},mx={0,-1,0,1};
        int len=Integer.parseInt(I.readLine());
        String str=I.readLine();
        int id=0,x=50,y=50,minx=x,maxx=x,miny=y,maxy=y;
        miro[y][x]='.';
        for(int i=0;i<len;i++){
            char c=str.charAt(i);
            if(c=='R'){
                id+=1;
                if(id==4) id=0;
            }else if(c=='L'){
                id-=1;
                if(id<0) id=3;
            }else{
                y+=my[id];
                x+=mx[id];
                miro[y][x]='.';
                if(x<minx) minx=x;
                else if(x>maxx) maxx=x;
                if(y<miny) miny=y;
                else if(y>maxy) maxy=y;
            }
        }
        for(int i=miny;i<=maxy;i++){
            String ts=String.valueOf(miro[i]).substring(minx,maxx+1);
            as.append(ts).append('\n');
        }
        System.out.println(as);
    }
}