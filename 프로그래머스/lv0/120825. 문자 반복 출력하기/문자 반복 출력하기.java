class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){ // 각 문자 선택
            for(int j=0; j<n; j++){
                answer += my_string.charAt(i); // 각 문자 n번씩 반복
            }
        }
        return answer;
    }
}