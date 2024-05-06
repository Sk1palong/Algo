import java.util.*;

class Solution {
    static int sortNum = -1;
    
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();
        String[] type = {"code", "date", "maximum", "remain"};
        int typeNum = -1;
        
        for(int i=0; i<type.length; i++) {
            if(ext.equals(type[i])) {
                typeNum = i;
            }
            if(sort_by.equals(type[i])) {
                sortNum = i;
            }
        }
            
        Arrays.sort(data, new Comparator<int[]>() {
           @Override
            public int compare(int[] o1, int[] o2) {
                
                return Integer.compare(o1[sortNum], o2[sortNum]);
            }
        });
        
        for(int i=0; i<data.length; i++) {
            if(data[i][typeNum] < val_ext) {
                answer.add(data[i]);
            }
        }
    
        return answer;
    }
}