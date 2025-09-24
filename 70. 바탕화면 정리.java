class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int len = wallpaper.length;
        int wid = wallpaper[0].length();
        char[][] arr = new char[len][wid];
        for (int i = 0; i < len; i++)
            arr[i] = wallpaper[i].toCharArray();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wid; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = 0; j < wid; j++) {
                if (arr[i][j] == '#') {
                    System.out.println(i + " " + j);
                    answer[0] = i;
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        for (int i = 0; i < wid; i++) {
            boolean flag = false;
            for (int j = 0; j < len; j++) {
                if (arr[j][i] == '#') {
                    answer[1] = i;
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        for (int i = len - 1; i >= 0; i--) {
            boolean flag = false;
            for (int j = wid - 1; j >= 0; j--) {
                if (arr[i][j] == '#') {
                    answer[2] = i + 1;
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        for (int i = wid - 1; i >= 0; i--) {
            boolean flag = false;
            for (int j = len - 1; j >= 0; j--) {
                if (arr[j][i] == '#') {
                    answer[3] = i + 1;
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        return answer;
    }
}