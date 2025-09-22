import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : ingredient) {
            stack.push(i);
            if (stack.size() >= 4) {
                int len = stack.size();
                if (stack.get(len - 4) == 1
                        && stack.get(len - 3) == 2
                        && stack.get(len - 2) == 3
                        && stack.get(len - 1) == 1) {
                    
                    answer++;
                    for(int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                }
            }
        }
        return answer;
    }
}