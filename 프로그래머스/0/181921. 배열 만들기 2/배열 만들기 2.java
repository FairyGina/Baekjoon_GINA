import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<Integer> as=new ArrayList<>();
        arr.add("5");
        int ct=1;
        while(arr.get(arr.size()-1).length()<=5){
            int sz=arr.size();
            for(int i=sz-ct;i<sz;i++){
                arr.add(arr.get(i)+"0");
                arr.add(arr.get(i)+"5");
            }
            ct*=2;
        }
        for(String tr: arr){
            int tn=Integer.valueOf(tr);
            if(tn>=l && tn<=r) as.add(tn);
        }

        int[] nb=as.stream().mapToInt(i->i).toArray();
        if (nb.length<1) return new int[]{-1};
        
        return nb;
    }
}

/*
17 -> 50
5 / 50 55 / 500 505 550 555 / 5000 5005 5050 5055 5500 5505 5550 5555 /
*/