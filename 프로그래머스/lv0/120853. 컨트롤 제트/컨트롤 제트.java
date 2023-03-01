import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        String[] str = s.split(" ");
        
        for(int i=0; i<str.length; i++){
            if(!str[i].equals("Z")){
                stack.push(Integer.parseInt(str[i]));
            }
            else{
                if(stack.size()>=1){
                    stack.pop();
                }
            }
        }
        while(stack.size() != 0){
            answer += stack.pop();
        }
        return answer;
    }
}