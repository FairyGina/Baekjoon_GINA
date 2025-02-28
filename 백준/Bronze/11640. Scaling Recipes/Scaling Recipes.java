import java.io.*;
import java.util.*;
class Recipe{ 
    String name;
    double rec, md;
    public Recipe(String name, double rec, double md){ // 재료 이름, 레시피 기준 양, 만들고자 하는 양
        this.name=name;
        this.rec=rec;
        this.md=md;
    }
}
class Main{   
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(I.readLine());
        for(int i=1;i<=t;i++){
            O.write("Recipe # "+i+"\n");
            StringTokenizer s=new StringTokenizer(I.readLine());
            int r=Integer.parseInt(s.nextToken());
            double p=Double.parseDouble(s.nextToken()),d=Double.parseDouble(s.nextToken());
            Recipe[] arr=new Recipe[r];
            double g=0;
            for(int j=0;j<r;j++){
                s=new StringTokenizer(I.readLine());
                arr[j] =new Recipe(s.nextToken(), Double.parseDouble(s.nextToken()), Double.parseDouble(s.nextToken()));
                if(arr[j].md==100.0){
                    g=arr[j].rec;
                }
            }
            for(Recipe recipe:arr){
                O.write(recipe.name+" "+String.format("%.1f",(d/p*g*recipe.md)/100)+"\n");
            }
            O.write("----------------------------------------\n");
        }
        O.flush();
    }
}