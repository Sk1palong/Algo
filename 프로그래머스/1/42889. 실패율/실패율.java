import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer,Double>hm = new HashMap<>();
        int[] answer = new int[N];
        double[] stage_ratio = new double[N];
        int[] reached = new int[N];
        int[] fail = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (i + 1 <= stages[j]) {
                    reached[i]++;
                }
                if(i+1 == stages[j]){
                    fail[i]++;
                }
            }
            stage_ratio[i] = (double)fail[i]/reached[i];
            hm.put(i+1,stage_ratio[i]);
        }
        // HashMap의 값을 리스트로 복사
        List<Map.Entry<Integer,Double>> list = new ArrayList<>(hm.entrySet());

        // 값에 따라 버블 정렬
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).getValue() < list.get(j + 1).getValue()) {
                    // 두 항목을 교환
                    Map.Entry<Integer,Double> temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println(list);
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i).getKey();
        }

        return answer;
    }
}