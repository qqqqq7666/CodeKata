class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            char temp = c;
            int idx = 0;
            while (idx < index) {
                if(temp == 'z')
                    temp = 'a';
                else
                    temp += 1;
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            sb.append(temp);
        }

        return sb.toString();
    }
}