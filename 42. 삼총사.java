class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int idx0 = 0, idx1 = 1, idx2 = 2;
        while (idx0 < number.length - 2) {
            if(number[idx0] + number[idx1] + number[idx2] == 0)
                answer++;
            idx2++;
            if(idx2 == number.length){
                idx1++;
                idx2 = idx1 + 1;
            }
            if(idx1 == number.length - 1) {
                idx0++;
                idx1 = idx0 + 1;
                idx2 = idx1 + 1;
            }
        }
        return answer;
    }
}