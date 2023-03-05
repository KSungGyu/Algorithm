class Solution {
    public int solution(int order) {
        int answer = 0;
        String arr = String.valueOf(order);

       for(int i=0; i<arr.length(); i++){
           if(arr.charAt(i)=='3' || arr.charAt(i)=='6' || arr.charAt(i)=='9'){
               answer ++;
           }
       }
        return answer;
    }
}