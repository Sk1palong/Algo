class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int cnt =0;
        int c =0;
        String[] arr = polynomial.split(" ");
        for(int i=0; i<arr.length; i++){
            if(arr[i].endsWith("x") && !arr[i].startsWith("x") ){
                cnt += Integer.parseInt(arr[i].substring(0,arr[i].indexOf("x")));
            } else if (arr[i].equals("x")) {
                cnt++;
            } else if (!arr[i].equals("+")) {
                c += Integer.parseInt(arr[i]);
            }
        }

        return (cnt != 0 ? cnt > 1 ? cnt + "x" : "x" : "")
                + (c != 0 ? (cnt != 0 ? " + " : "")
                + c : cnt == 0 ? "0" : "");
    }
}