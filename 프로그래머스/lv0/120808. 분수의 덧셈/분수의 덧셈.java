class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int result1 = (numer1*denom2)+(denom1*numer2); // 분자구하기
        int result2 = denom1 * denom2; // 분모구하기
        int max = 0;
        
        for(int i=1; i<=result1 && i<=result2; i++){
            if(result1%i==0 && result2%i==0){
                max=i;
            }
        }
        
        if(result1%max==0 && result2%max==0){
            result1/=max;
            result2/=max;
        }
        
        int[] answer = {result1,result2};
        return answer;
    }
}