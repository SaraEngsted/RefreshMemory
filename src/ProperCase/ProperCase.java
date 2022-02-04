package ProperCase;

import java.util.Locale;

public class ProperCase {

    public boolean sentence (String wordsWithSpace) {

        String space = " ";
        String[] sentenceToSplit = wordsWithSpace.split(" ");

        for (int i = 0; i < wordsWithSpace.length(); i++) {
            int length = wordsWithSpace.length();

            if (sentenceToSplit[i].matches("[A-Z]")) {
                return true;

            } else if (sentenceToSplit[i].length() <= 3) {
                sentenceToSplit[i] = sentenceToSplit[i].toLowerCase();
                sentenceToSplit[i] = sentenceToSplit[i].substring(0,1).toUpperCase();
                return true;

            } else if (sentenceToSplit[i].length() >= 3) {
                sentenceToSplit[i] = sentenceToSplit[i].toLowerCase();
                return true;
            }

        } return false;

    }

}
