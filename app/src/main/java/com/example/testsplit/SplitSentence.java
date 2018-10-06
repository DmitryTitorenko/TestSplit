package com.example.testsplit;

public class SplitSentence {

    /**
     * Split sentence to words.
     * One line cannot contain > 4 words.
     *
     * @param sentence to split
     */
    public static String split(String sentence) {
        StringBuilder result = new StringBuilder();
        int i = 0; // use for create lines <= 4 words
        for (String word : sentence.split(" ")) {
            result.append(word).append(" ");
            ++i;
            if (i == 4) {
                result.append("\n");
                i = 0;
            }
        }
        return result.toString();
    }
}
