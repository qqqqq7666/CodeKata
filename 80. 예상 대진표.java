class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while(b != a) {
            answer++;
            a++;
            b++;
            
            a /= 2;
            b /= 2;
        }

        return answer;
    }
}