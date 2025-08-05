import java.io.*;
import java.util.*;
class Main{
    static long lm=Long.MAX_VALUE;
    static int ten(int lt,String s,List<Integer> arr){
        int ct=0,mx=0;
        while(--lt>=0){
            char c=s.charAt(lt);
            if(c>'9'){
                arr.add(((int)c)-87);
            }else arr.add((int)(c-'0'));
            if(mx<arr.get(ct)) mx=arr.get(ct);
            ct++;
        }
        return mx;
    }
    static void gn(int lt,int mx,List<Integer> arr,long[] nb){
        for(int mt=mx;mt<37;mt++){
            long num=0;
            for(int pw=0;pw<lt;pw++){
                long mul=1;
                for(int k=0;k<pw;k++){
                    if(mul>lm/mt){
                        num=lm;
                        break;
                    }
                    mul*=mt;
                }
                if(num==lm) break;
                if(arr.get(pw)>0&&mul>lm/arr.get(pw)){
                    num=lm;
                    break;
                }
                mul*=arr.get(pw);
                if(num>lm-mul){
                    num=lm;
                    break;
                }
                num+=mul;
            }
            if(num<lm) nb[mt]=num;
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        String a=st.nextToken(),b=st.nextToken();
        List<Integer> ta=new ArrayList<>(),tb=new ArrayList<>();
        long[] na=new long[37],nb=new long[37];
        Arrays.fill(na,-1); Arrays.fill(nb,-1);
        int amx,bmx,alt=a.length(),blt=b.length();

        amx=ten(alt,a,ta);
        bmx=ten(blt,b,tb);
        amx++; bmx++;
        amx=Math.max(2,amx); bmx=Math.max(2,bmx);
        gn(alt,amx,ta,na);
        gn(blt,bmx,tb,nb);
        
        int ct=0;
        for(int i=amx;i<37;i++){
            if(na[i]<0) continue;
            for(int j=bmx;j<37;j++){
                if(i!=j&&na[i]==nb[j]){
                    ct++;
                    alt=i; blt=j;
                }
            }
        }
        if(ct<1) System.out.print("Impossible");
        else if(ct<2) System.out.printf("%d %d %d",na[alt],alt,blt);
        else System.out.print("Multiple");
    }
}