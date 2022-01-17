package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatics {

    public Map<Character, Integer> findLetters(String word) {
        Map<Character, Integer> countOfLetters = new HashMap<>();
        for (char c : word.toCharArray()) {
            if (countOfLetters.containsKey(c)) {
                countOfLetters.put(c, countOfLetters.get(c) + 1);
            } else {
                countOfLetters.put(c, 1);
            }
        }
        return countOfLetters;
    }
}
