class Solution {
    public int solution(String s) {
        int answer = 0, firstCnt = 0, diffCnt = 0, idx = 0;
        char firstChar = s.charAt(0);
        char[] sArray = s.toCharArray();
        for(int i = 0; i < sArray.length; i++) {
            if(firstChar == sArray[i])
                firstCnt++;
            else
                diffCnt++;

            if(firstCnt == diffCnt) {
                firstCnt = 0;
                diffCnt = 0;
                answer++;
                if(i < sArray.length - 1)
                    firstChar = sArray[i + 1];
            }
        }
        if(firstCnt == 1)
            answer++;
        return answer;
    }
}