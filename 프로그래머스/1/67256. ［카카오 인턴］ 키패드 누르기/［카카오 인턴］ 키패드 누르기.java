import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String left = "*";
        String right = "#";
        Map<String, String> map = new HashMap<>();
        
        for(int i = 0; i<9; i++) {
            map.put(String.valueOf(i+1), i/3 + "," + i%3);
        }
        
        map.put("0", "3,1");
        map.put("*", "3,0");
        map.put("#", "3,2");

        for(int n : numbers) {
            if(n == 1 || n == 4 || n == 7) {
                answer += "L";
                left = n + "";
            }
            else if(n == 3 || n == 6 || n == 9) {
                answer += "R";
                right = n + "";
            }
            else if(left.equals("*") && right.equals("#")) {
                if(hand.equals("right")) {
                    answer += "R";
                    right = n + "";
                } 
                else {
                    answer += "L";
                    left = n + "";
                }
            }
            else {
                if(Math.abs(Integer.parseInt(map.get(right).split(",")[0]) - Integer.parseInt(map.get(n+"").split(",")[0])) + 
                   Math.abs(Integer.parseInt(map.get(right).split(",")[1]) - Integer.parseInt(map.get(n+"").split(",")[1])) > 
                   Math.abs(Integer.parseInt(map.get(left).split(",")[0]) - Integer.parseInt(map.get(n+"").split(",")[0])) + 
                   Math.abs(Integer.parseInt(map.get(left).split(",")[1]) - Integer.parseInt(map.get(n+"").split(",")[1]))) {
                   //  System.out.println("left distance : " + (Math.abs(Integer.parseInt(map.get(left).split(",")[0]) - Integer.parseInt(map.get(n+"").split(",")[0])) + 
                   // Math.abs(Integer.parseInt(map.get(left).split(",")[1]) - Integer.parseInt(map.get(n+"").split(",")[1]))));
                   //  System.out.println("right distance : " + (Math.abs(Integer.parseInt(map.get(right).split(",")[0]) - Integer.parseInt(map.get(n+"").split(",")[0])) + 
                   // Math.abs(Integer.parseInt(map.get(right).split(",")[1]) - Integer.parseInt(map.get(n+"").split(",")[1]))));
                    answer += "L";
                        left = n + "";
                }
                else if(Math.abs(Integer.parseInt(map.get(right).split(",")[0]) - Integer.parseInt(map.get(n+"").split(",")[0])) + 
                   Math.abs(Integer.parseInt(map.get(right).split(",")[1]) - Integer.parseInt(map.get(n+"").split(",")[1])) == 
                   Math.abs(Integer.parseInt(map.get(left).split(",")[0]) - Integer.parseInt(map.get(n+"").split(",")[0])) + 
                   Math.abs(Integer.parseInt(map.get(left).split(",")[1]) - Integer.parseInt(map.get(n+"").split(",")[1]))) {
                    if(hand.equals("right")) {
                        answer += "R";
                        right = n + "";
                    } 
                    else {
                        answer += "L";
                        left = n + "";
                        // System.out.println(hand);
                    }
                }
                else {
                    answer += "R";
                    right = n + "";
                }
            }
            // System.out.println("left : " + left);
            // System.out.println("right : " + right);
        }
        return answer;
    }
}