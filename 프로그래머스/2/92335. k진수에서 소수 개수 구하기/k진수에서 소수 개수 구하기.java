class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        String[] arr = s.split("0");
        
 loop : for(String tmp : arr) {
            if(tmp.equals("")) {
                continue;
            }
            if(tmp.length() >= 12) {
                Long l = Long.parseLong(tmp);
                for(long i=2; i<=Math.sqrt(l); i++) {
                    if(l % i == 0) {
                        continue loop;
                    }
                }
            }
            else {
                int num = Integer.parseInt(tmp);
                if(num == 1) {
                    continue;
                }
                for(int i=2; i<=Math.sqrt(num); i++) {
                    if(num % i == 0) {
                        continue loop;
                    }
                }
            }
            answer++;
        }
                
        return answer;
    }
}