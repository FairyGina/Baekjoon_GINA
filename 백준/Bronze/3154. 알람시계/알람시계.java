import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

		String[] ip=I.readLine().trim().split(":");
		int h=Integer.parseInt(ip[0]),m=Integer.parseInt(ip[1]);
		List<Integer> hl=new ArrayList<>(),ml=new ArrayList<>();
		while(h<100){
			hl.add(h);
			h+=24;
		}
		while(m<100){
			ml.add(m);
			m+=60;
		}
		int minct=1000000;
		int a=0,b=0;
		for(int hh:hl){
			for(int mm:ml){
				String time=String.format("%02d%02d",hh,mm);
				int ct=0,nb=(time.charAt(0)-'0')-1;
				int sy=3,sx=1;
				if(nb>=0){
					sy=nb/3;
					sx=nb%3;
				}
				for(int i=1;i<4;i++){
					nb=(time.charAt(i)-'0')-1;
					int y=3,x=1;
					if(nb>=0){
						y=nb/3;
						x=nb%3;
					}
					ct+=Math.abs(y-sy)+Math.abs(x-sx);
					sy=y;
					sx=x;
				}
				if(ct<minct){
					minct=ct;
					a=hh;
					b=mm;
				}
			}
		}
		System.out.printf("%02d:%02d",a,b);
	}
}