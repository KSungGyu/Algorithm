import java.util.*;
class Solution {
    public int[] solution(int n) {
       ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(n%i==0){
                list.add(i);
            }
        }
        int[] answer = list.stream()
                .filter(i -> i != null)
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
}