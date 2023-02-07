class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        int alpa = 97;
        String[] letterArr = letter.split(" ");
        String answer = "";
        for(int i=0; i<letterArr.length; i++){
            for(int j=0; j<morse.length; j++){
                if(letterArr[i].equals(morse[j])){
                    answer += (char)(j+97);
                }
            }
        }
        return answer;
    }
}