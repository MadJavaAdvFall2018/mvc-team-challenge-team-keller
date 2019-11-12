package java112.project3;

import java.util.*;

public class PigLatin {

    private String translation;
    private List<String> vowels = new ArrayList<String>();

    public PigLatin() {
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String english) {
        this.translation = translate(english);
    }

    public String translate(String english) {

        List<String> translatedWords = new ArrayList<String>();

        for (String word : english.split("\\W")) {
            if (word.length() > 0) {
                translatedWords.add(convertToPigLatin(word.toLowerCase()));
            }
        }

        return String.join(" ", translatedWords);
    }

    public String convertToPigLatin(String word) {

        String pig = "";

        if (!vowels.contains(word.substring(0, 1))) {
            pig = word.substring(1) + word.substring(0, 1) + "ay";
        } else {
            pig = word + "yay";
        }

        return pig;

    }

}
