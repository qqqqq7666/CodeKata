import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> res = new ArrayList<>();
        int idx = 1;
        LocalDate currentDate = toDate(today);
        
        Map<String, Integer> map = new HashMap<>();
        for(String term : terms) {
            String[] temp = term.split(" ");
            map.put(temp[0], Integer.parseInt(temp[1]));
        }

        for(String privacy: privacies) {
            String[] temp = privacy.split(" ");
            LocalDate date = toDate(temp[0]);
            if(currentDate.isAfter(date.plusMonths(map.get(temp[1]))) || currentDate.isEqual(date.plusMonths(map.get(temp[1]))))
                res.add(idx);
            
            idx++;
        }
        return res.stream().mapToInt(i -> i.intValue()).toArray();
    }

    public static LocalDate toDate(String value) {
        String[] parseInt = value.split("\\.");
        int year = Integer.parseInt(parseInt[0]);
        int month = Integer.parseInt(parseInt[1]);
        int date = Integer.parseInt(parseInt[2]);
        return LocalDate.of(year, month, date);
    }
}