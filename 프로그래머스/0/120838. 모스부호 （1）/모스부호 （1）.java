import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'";
        morse = morse.replace("'","");
        String[] arr = morse.split(",");
        Map<String, String> map = new HashMap<>();
        
        for(String s : arr) {
            String[] morseArr = s.split(":");
            map.put(morseArr[0], morseArr[1]);
        }
        
        String[] letterArr = letter.split(" ");
        
        for(String s : letterArr) {
            answer += map.get(s);
        }
        return answer;
    }
}