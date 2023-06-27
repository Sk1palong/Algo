class Solution {
    public int[] solution(int[] num_list) {
        int i = 0;
        int j = num_list.length;
        int tmp = 0;
        while(i<=j-1){
            tmp = num_list[i];
            num_list[i] = num_list[j-1];
            num_list[j-1] = tmp;
            i++; j--;
        }
        
        return num_list;
    }
}