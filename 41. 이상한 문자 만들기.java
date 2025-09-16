class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean flag = true;
        for(int i = 0; i < s.length(); i++) {
            if(sb.charAt(i) == ' '){
                flag = true;
                continue;
            }
            if(flag)
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            else
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            flag = !flag;
        }

        return sb.toString();
    }
}