class Solution {
    public int solution(int n) {
        int answer = 1+n/7; // 사람수가 7명보다 적을경우를 위해 +1
        if(n%7==0){
            answer --;
        }
        return answer;
    }
}