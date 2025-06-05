import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        
        int n=Integer.parseInt(I.readLine());
        
        StringBuilder[] star=new StringBuilder[n];
        StringBuilder space=new StringBuilder("     ");
        star[0]=new StringBuilder("*");
        star[1]=new StringBuilder("* *");
        star[2]=new StringBuilder("*****");
        
        for(int t=3;t<n;t*=2){
            StringBuilder copy=new StringBuilder(space);
            for(int j=0;j<t;j++){
                star[j+t]=new StringBuilder(star[j]).append(copy);
                copy.delete(0,2);
            }
            for(int j=0;j<t;j++){
                star[j+t].append(star[j]);
            }
            space.append(space).append(' ');
        }
        space.delete(0,space.length()/2+1);
        for(int i=0;i<n;i++){
            as.append(space).append(star[i]).append(space).append('\n');
            space.delete(0,1);
        }
        System.out.print(as);
    }
}