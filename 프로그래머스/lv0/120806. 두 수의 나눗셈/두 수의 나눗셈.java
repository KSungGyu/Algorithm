class Solution {
    public int solution(int num1, int num2) {
        int answer = (int)((double)num1/num2*1000);
        // num1에 num2를 나누고 1000을 곱한값을 double로 형변환 후 int로 다시 형변환해서 정수부분만
        return answer;
    }
}