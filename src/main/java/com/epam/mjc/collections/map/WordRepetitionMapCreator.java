package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> res = new HashMap<>();
        String[] words = sentence.replaceAll("\\W", " ").toLowerCase().split(" ");
        for (String word : words) {
            if (!word.equals("")) {
                if (res.containsKey(word.trim())) res.replace(word.trim(), res.get(word.trim()) + 1);
                else res.put(word.trim(), 1);
            }
        }

        return res;
    }
}
