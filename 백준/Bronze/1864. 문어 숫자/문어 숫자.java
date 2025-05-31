import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int[] hm=new int[93];
        hm['-']=0;
		hm['\\']=1;
		hm['(']=2;
		hm['@']=3;
		hm['?']=4;
		hm['>']=5;
		hm['&']=6;
		hm['%']=7;
		hm['/']=-1;
        String s;
        while(!(s=I.readLine()).equals("#")){
            long res=0;
            int len=s.length();
            int x=len-1;
            for(int i=0;i<len;i++){
                res+=Math.pow(8,x--)*hm[(s.charAt(i))];
            }
            as.append(res).append('\n');
        }
        System.out.print(as);
    }
}