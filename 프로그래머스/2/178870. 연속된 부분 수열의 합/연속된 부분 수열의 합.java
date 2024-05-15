import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int start = 0;
        int end = 1;
        int sum = sequence[0];
        int leng = sequence.length;
        List<int[]> li = new ArrayList<>();
        
        while(start < end) {
            if(sum == k) {
                li.add(new int[]{start, end - 1});
                sum -= sequence[start++];
            }
            else if(sum > k) {
                sum -= sequence[start++];
            }
            else if(end < leng) {
                sum += sequence[end++];
            }
            else break;
        }
        
        Collections.sort(li, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                int result = (a1[1] - a1[0]) - (a2[1] - a2[0]);
                
                if(result == 0) {
                    return a1[0] - a2[0];
                }
                
                return result;
            }
        });
        
        return li.get(0);
    }
}