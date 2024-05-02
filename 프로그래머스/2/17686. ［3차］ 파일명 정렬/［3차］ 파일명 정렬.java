import java.util.*;

class Solution {
    public static int sort(String s, String head) {
        s = s.replace(head, "");
        String result = "";
        for(int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                result += c;
            }
            else {
                break;
            }
        }
        
        return Integer.valueOf(result);
    }
    
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String head1 = o1.split("[0-9]")[0];
                String head2 = o2.split("[0-9]")[0];
                int result = head1.toLowerCase().compareTo(head2.toLowerCase());
                
                if(result == 0) {
                    result = sort(o1, head1) - sort(o2, head2);
                }
                
                return result;
            }
        }); 
        return files;
    }
}