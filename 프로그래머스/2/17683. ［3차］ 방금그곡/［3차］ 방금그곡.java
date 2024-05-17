import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        String[] origin = {"C#", "D#", "F#", "G#", "A#", "B#"};
        String[] change = {"c", "d", "f", "g", "a", "b"};

        Arrays.sort(musicinfos, new Comparator<String>() {
           @Override
            public int compare(String s1, String s2) {
                int time1 = getTime(s1);
                int time2 = getTime(s2);
                int result = time1 - time2;
                if(result == 0) {
                    result = s2.compareTo(s1);
                }
                return result;
            }
        });
        
        for(int i=0; i<musicinfos.length; i++) {
            String melody = "";
            int time = getTime(musicinfos[i]);
            String[] infos = musicinfos[i].split(",");
            
            for(int j=0; j<origin.length; j++) {
                m = m.replace(origin[j], change[j]);
                infos[3] = infos[3].replace(origin[j], change[j]);
            }
            for(int j=0; j<time; j++) {
                melody += infos[3].charAt(j % infos[3].length());
            } 

            if(melody.contains(m)) {
                answer = infos[2];
            }
        }
        
        return answer;
    }
    
    public int getTime(String s1) {
        int start = Integer.parseInt(s1.substring(3, 5))
                + 60 * Integer.parseInt(s1.substring(0, 2));
        int end = Integer.parseInt(s1.substring(9, 11))
            + 60 * Integer.parseInt(s1.substring(6, 8));
        return end - start;
    }
}