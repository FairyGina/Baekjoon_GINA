import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        List<Integer> nlist=Arrays.asList(Arrays.stream(num_list)
                                              .boxed().toArray(Integer[]::new));
        return nlist.contains(n)?1:0;
    }
}