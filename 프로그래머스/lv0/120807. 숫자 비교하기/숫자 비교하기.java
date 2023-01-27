class Solution {
    public int solution(int num1, int num2) {
        int answer = num1==num2 ? 1 : -1;
        //3항연산자를 사용하여 num1과 num2가 같다는 식이 true면 1, false면 -1
        return answer;
    }
}