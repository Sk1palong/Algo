import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int y = wallpaper.length;
        int x = wallpaper[0].length();
        // answer[1]
        List<Integer> idxX = new ArrayList<>();
        // answer[0], answer[2]
        List<Integer> idxY = new ArrayList<>(); 
        // answer[3]
        List<Integer> lastIdxX = new ArrayList<>();

        for(int i=0; i<wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                idxX.add(wallpaper[i].indexOf("#"));
                idxY.add(i);
                lastIdxX.add(wallpaper[i].lastIndexOf("#"));
            }
            
            
        }
        Collections.sort(idxX);
        Collections.sort(idxY);
        Collections.sort(lastIdxX);
        System.out.println("answer[0] : " +idxY.get(0));
        System.out.println("answer[1] : " + idxX.get(0));
        System.out.println("answer[2] : " + (idxY.get(idxY.size() -1 ) +1));
        System.out.println("answer[3] : " + (lastIdxX.get(lastIdxX.size() -1) + 1));
        answer[0] = idxY.get(0);
        answer[1] = idxX.get(0);
        answer[2] = idxY.get(idxY.size()-1) +1;
        answer[3] = lastIdxX.get(lastIdxX.size() -1) +1;
        
        // System.out.println(Arrays.toString(answer));
        return answer;
    }
}