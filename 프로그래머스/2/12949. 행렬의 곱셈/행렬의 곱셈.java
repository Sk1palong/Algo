class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        // 3*2 2*2 -> 3*2
        // 3*3 3*3 -> 3*3
        
        // 1 4  3 3  15 15
        // 3 2  3 3  15 15
        // 4 1       15 15

        //   j        j
        // i 2 3 2  i 5 4 3   22 22 11
        //   4 2 4    2 4 1   36 28 18
        //   3 1 4    3 1 1   29 20 14

        for(int i=0; i<arr1.length; i++) {
            // System.out.println("i : " + i);
            for(int j=0; j<arr1[i].length; j++) {
                int a = arr1[i][j];
                // System.out.println("arr1[i][j] = " + arr1[i][j]);
                for(int k=0; k<arr2[j].length; k++) {
                    int b = arr2[j][k];
                    // System.out.println("arr2[j][k] = " + arr2[j][k]);
                    answer[i][k] += a*b;
                }
            }
        }

        return answer;
    }
}