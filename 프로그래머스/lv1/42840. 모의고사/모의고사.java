import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] cnt  = new int[3];
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] ill = new int[answers.length];
        int[] yee = new int[answers.length];
        int[] sam = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            ill[i] = one[i%5];
            yee[i] = two[i%8];
            sam[i] = three[i%10];
            if(ill[i]==answers[i]){
                cnt[0]++;
            }if(yee[i]==answers[i]){
                cnt[1]++;
            }if(sam[i]==answers[i]){
                cnt[2]++;
            }
        }
        int max = cnt[0];
        for (int i = 1; i < cnt.length; i++) {
            if(cnt[i]>=max){
                max = cnt[i];
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] == max){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}