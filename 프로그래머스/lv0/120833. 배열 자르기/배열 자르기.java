class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int length = num2 - num1; // num1~num2 배열 길이
        int[] answer = new int[length+1]; // 배열 0도 포함하기 위해 +1
        
        for(int i=0; i<=length; i++){
            answer[i] = numbers[num1+i]; // num1부터 순서대로 대입
        }
        
        return answer;
    }
}