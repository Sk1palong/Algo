import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> caches = new LinkedList<>();
        
        for(int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }
        
        if(cacheSize == 0) {
            answer = 5 * cities.length;
        }
        else {
            for(int i=0; i<cities.length; i++) {
                if(!caches.contains(cities[i])) {
                    if(caches.size() < cacheSize) {
                        caches.add(cities[i]);
                    }
                    else {
                        caches.remove(0);
                        caches.add(cities[i]);
                    }
                    answer+=5;
                }
                else {
                    caches.remove(caches.indexOf(cities[i]));
                    caches.add(cities[i]);
                    answer++;
                }
            }
        }
        
        System.out.println(caches);

        
        return answer;
    }
}