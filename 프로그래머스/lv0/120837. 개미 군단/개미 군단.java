class Solution {
    public int solution(int hp) {
        int answer = 0;
        // hp23 기준
        answer += hp/5; // answer에 hp를 5로 나눈 몫을 저장 (장군개미 4마리 사용)
        hp%=5; // hp에서 5로 나눈 나머지를 hp에 저장 (hp=3)
        
        answer += hp/3;
        hp%=3;
        
        answer += hp/1;
        
        return answer;
    }
}