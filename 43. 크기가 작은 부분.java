class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        int pLength = p.length();
        int idx = 0;
        while(idx <= t.length() - pLength) {
            if(Long.parseLong(t.substring(idx, pLength + idx)) <= pNum)
                answer++;
            idx++;
        }
        
        return answer;
    }
}