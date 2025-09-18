class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int minCnt = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < targets.length; i++) {
            for (char c : targets[i].toCharArray()) {
                for (String key : keymap) {
                    if (key.indexOf(c) >= 0 && key.indexOf(c) < minCnt)
                        minCnt = key.indexOf(c) + 1;
                }
                res += minCnt;
                minCnt = Integer.MAX_VALUE;
            }
            if (res <= 0 || res == Integer.MAX_VALUE)
                res = -1;
            answer[i] = res;
            res = 0;
        }
        return answer;
    }
}