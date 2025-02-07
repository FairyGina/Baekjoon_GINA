import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),k=s.nextInt(),i=0,r=0,MAX=100001;
        Queue<Integer> q=new LinkedList<>();
        boolean[] T=new boolean[MAX];
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(n);
        while(i<MAX){
            a.add(new ArrayList<>());
            a.get(i).add(i-1);
            a.get(i).add(i+1);
            a.get(i).add(2*i);
            i++;
        } // 인접리스트 준비
        q.offer(n);
        L: do{
            int z=q.size();
            i=0;
            do { 
                int x=q.poll();
                i++;
                if (x==k) break L;
                else{
                    ArrayList<Integer> d = a.get(x);
                    for(int j=0;j<3;j++){
                        if((d.get(j)<0)||(d.get(j)>=MAX)) continue;
                        else if(T[d.get(j)]!=false) continue;
                        else{
                            T[d.get(j)]=true;
                            q.offer(d.get(j));
                        }
                    }
                }
            } while (i<z);
            r++;
        }while(true);
        System.out.print(r);
    }
}