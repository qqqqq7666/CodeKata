import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder builder = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int mul = 1;
        while (n > 0) {
            list.add(n % 3);
            n /= 3;
        }
        Collections.reverse(list);
        for(int num : list) {
            System.out.print(num + " ");
            answer += num * mul;
            mul *= 3;
        }
        
        
        return answer;
    }
}