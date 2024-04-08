import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        // Arrays.sort(phone_book);
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<phone_book.length; i++) {
            set.add(phone_book[i]);
        }
        
        for(int i=0; i<phone_book.length; i++) {
            for(int j=0; j<phone_book[i].length(); j++) {
                if(set.contains(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        
        // for(int i=0; i<phone_book.length-1; i++) {
        //     if(phone_book[i+1].startsWith(phone_book[i])) {
        //         return false;
        //     }
        // }
        
        return answer;
    }
}