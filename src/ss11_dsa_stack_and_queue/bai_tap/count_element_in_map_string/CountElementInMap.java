package ss11_dsa_stack_and_queue.bai_tap.count_element_in_map_string;

import java.util.ArrayList;
import java.util.TreeMap;

public class CountElementInMap {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String string = "helLo wOrld Hollo Werld";
        string = string.toLowerCase();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            arrayList.add(string.charAt(i));
        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (!map.containsKey(arrayList.get(i))) {
                map.put(arrayList.get(i), 1);

            } else {
                map.put(arrayList.get(i), map.get(arrayList.get(i)) + 1);

            }
        }
        System.out.println(map);
    }
}
