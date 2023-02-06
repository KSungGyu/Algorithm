import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = Arrays.copyOf(emergency, emergency.length); // 배열 복사
        Arrays.sort(copy); // 복사한 배열 오름차순 3, 24, 76
        
        for(int i=0; i<copy.length; i++){
            for(int j=0; j<copy.length; j++){
                if(emergency[i] == copy[j]){
                    answer[i] = copy.length-j; // answer[0] = 3
                }
            }
        }

        return answer;
    }
}