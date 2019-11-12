package java112.project3;

import java.util.*;

public class PigLatin {

    private String translation;

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String english) {
        this.translation = convertToPigLatin(english);
    }

    public String convertToPigLatin(String english) {

        List<String> translatedWords = new ArrayList<String>();

        for (String word : english.split("\\W")) {
            if (word.length() > 0) {
                //TODO make words piglatin
                translatedWords.add(word);
            }
        }

        return String.join(" ", translatedWords);
        // return english;
    }

}
