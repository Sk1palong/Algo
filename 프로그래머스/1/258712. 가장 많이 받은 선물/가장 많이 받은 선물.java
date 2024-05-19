import java.util.*; 

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int leng = friends.length;
        Map<String, List<String>> give = new HashMap<>();
        Map<String, List<String>> receive = new HashMap<>();
        Map<String, Integer> index = new HashMap<>();
        Map<String, Integer> get = new HashMap<>();
        Map<String, Integer> expected = new HashMap<>();
        
        for(String name : friends) {
            give.put(name, new ArrayList<>());
            receive.put(name, new ArrayList<>());
        }
        
        for(String gift : gifts) {
            String[] temp = gift.split(" ");
            give.get(temp[0]).add(temp[1]);
            receive.get(temp[1]).add(temp[0]);
        }
        
        for(String name : friends) {
            index.put(name, give.get(name).size() - receive.get(name).size());
        }
        int[][] matrix = new int[leng][leng];
        
        for(int i=0; i<leng; i++) {
            for(int j=0; j<leng; j++) {
                if(i != j) {
                    for(int k=0; k<gifts.length; k++) {
                        String[] temp = gifts[k].split(" ");
                        if(temp[0].equals(friends[i]) && temp[1].equals(friends[j])) {
                            matrix[i][j]++;
                            
                        }
                    }
                }
            }
        }
        for(int i=0; i<leng; i++) {
            for(int j=0; j<leng; j++) {
                if(i != j) {
                    if(matrix[i][j] > matrix[j][i]) {
                        expected.put(friends[i], expected.getOrDefault(friends[i], 0) + 1);
                    }
                    else if(matrix[i][j] == matrix[j][i]) {
                        if(index.get(friends[i]) > index.get(friends[j])) {
                            expected.put(friends[i], expected.getOrDefault(friends[i], 0) + 1);
                        }
                    }
                }
            }
        }
        
        for(int value : expected.values()) {
            answer = answer > value ? answer : value;
        }
        
        return answer;
    }
}