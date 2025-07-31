import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int[] my={-1,1,0,0},mx={0,0,-1,1};
        StringTokenizer st=new StringTokenizer(I.readLine());
        int r=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());
        char[][] ume=new char[r][c],cu=new char[r][c];
        for(int i=0;i<r;i++){
            String s=I.readLine();
            for(int j=0;j<c;j++){
                ume[i][j]=s.charAt(j);
            }
        }
        for(int i=0;i<r;i++){
            System.arraycopy(ume[i],0,cu[i],0,c);
        }
        for(int y=0;y<r;y++){
            for(int x=0;x<c;x++){
                if(ume[y][x]=='X'){
                    int ct=0;
                    for(int m=0;m<4;m++){
                        int ty=y+my[m],tx=x+mx[m];
                        if(ty<0||ty>=r||tx<0||tx>=c||ume[ty][tx]=='.') ct++;
                    }
                    if(ct>2) cu[y][x]='.';
                }
            }
        }
        int sy=r-1,sx=c-1,ey=0,ex=0;
        for(int y=0;y<r;y++){
            for(int x=0;x<c;x++){
                if(cu[y][x]=='X'){
                    if(sx>x) sx=x;
                    if(ex<x) ex=x;
                    if(sy>y) sy=y;
                    if(ey<y) ey=y;
                }
            }
        }

        for(int i=sy;i<=ey;i++){
            for(int j=sx;j<=ex;j++) as.append(cu[i][j]);
            as.append('\n');
        }
        System.out.print(as);
    }
}