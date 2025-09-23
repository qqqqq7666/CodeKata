class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] scores = new int[4];
        for (int i = 0; i < survey.length; i++) {
            int idx = 0;
            String current = survey[i];
            int choice = choices[i] - 4;
            if(current.startsWith("R") || current.startsWith("T")){
                idx = 1;
                if(current.startsWith("R"))
                    scores[idx] -= choice;
                else
                    scores[idx] += choice;
            }
            if(current.startsWith("C") || current.startsWith("F")){
                idx = 1;
                if(current.startsWith("C"))
                    scores[idx] -= choice;
                else
                    scores[idx] += choice;
            }
            if(current.startsWith("J") || current.startsWith("M")){
                idx = 2;
                if(current.startsWith("J"))
                    scores[idx] -= choice;
                else
                    scores[idx] += choice;
            }
            if(current.startsWith("A") || current.startsWith("N")){
                idx = 3;
                if(current.startsWith("A"))
                    scores[idx] -= choice;
                else
                    scores[idx] += choice;
            }
        }

        if(scores[0] >= 0) answer += "R";
        else answer += "T";
        if(scores[1] >= 0) answer += "C";
        else answer += "F";
        if(scores[2] >= 0) answer += "J";
        else answer += "M";
        if(scores[3] >= 0) answer += "A";
        else answer += "N";


        for (int score : scores) {
            if(score >= 0)
                answer += "R";
        }
        return answer;
    }
}