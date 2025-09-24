class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int len = wallpaper.length;
        int wid = wallpaper[0].length();
        char[][] arr = new char[wid][];
        for (int i = 0; i < wid; i++) 
            arr[i] = wallpaper[i].toCharArray();
        
        for (int i = 0; i < wid; i++) {
            for (int j = 0; j < len; j++) {
                if(arr[i][j] == '#'){
                    answer[0] = i;
                    break;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wid; j++) {
                if(arr[j][i] == '#'){
                    answer[1] = j;
                    break;
                }
            }
        }
        for (int i = wid - 1; i >= 0; i--) {
            for (int j = len - 1; j >= 0; j--) {
                if(arr[i][j] == '#'){
                    answer[2] = i;
                    break;
                }
            }
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = wid - 1; j >= 0; j--) {
                if(arr[i][j] == '#'){
                    answer[3] = j;
                    break;
                }
            }
        }
        return answer;
    }
}