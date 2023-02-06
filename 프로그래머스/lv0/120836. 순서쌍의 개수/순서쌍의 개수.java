class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){ // i=1부터 n의 약수 구하기
                answer ++;
            }
        }
        return answer;
    }
}