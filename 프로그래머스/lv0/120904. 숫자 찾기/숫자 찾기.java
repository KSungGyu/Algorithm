class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] num2 = String.valueOf(num).split("");
        
        for(int i=0; i<num2.length; i++){
            if(num2[i].equals(String.valueOf(k))){
                answer = i+1;
                break;
            }
            else{
                answer = -1;
            }
        }
        return answer;
    }
}