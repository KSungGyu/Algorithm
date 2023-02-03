class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) != letter.charAt(0)){ // my_string에 i번째 문자가 letter 문자와 다르면
                answer += my_string.charAt(i); // answer에 i번째 문자 추가
            }
        }
        
        return answer;
    }
}