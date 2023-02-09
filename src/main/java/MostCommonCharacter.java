import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char[] characters = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        // populate map with characters and count
        for (int i = 0; i < characters.length; i++) {
            if (map.containsKey(characters[i])) {
                map.put(characters[i], map.get(characters[i]) + 1);
            } else {
                map.put(characters[i], 1);
            }
        }

        // find max
        int max =(Collections.max(map.values()));

        for (Entry<Character, Integer> entry : map.entrySet()) {  
            if (entry.getValue() == max) {
                return entry.getKey();     
            }
        }

        return ' ';
    }
}
