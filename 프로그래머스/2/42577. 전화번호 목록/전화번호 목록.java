import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
//         Map<String, Integer> map = new HashMap<>();
        
//         for(int i=0; i<phone_book.length; i++) {
//             if(map.get)            
//             map.put(phone_book[i], map.getOrDefault(phone_book[i], 0) + 1);

//         }
//         System.out.println(map);
        for(int i=0; i<phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return answer;
    }
}