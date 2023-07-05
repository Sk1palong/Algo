import java.util.Arrays;

import static java.util.Arrays.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        while(myString.contains("xx")){
        myString = myString.replace("xx","x");
        }
        if(myString.startsWith("x")){
           myString = myString.substring(1,myString.length());
        }
        String[] arr = myString.split("x");
            
        Arrays.sort(arr);
        return arr;
    }
}