package lab_5;

import java.util.Arrays;

public class Sentence {
    private SentenceElements[] sentenceElements;

    public Sentence(SentenceElements[] sentenceElements) {
        this.sentenceElements = sentenceElements;
    }

    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (int i = 0; i < sentenceElements.length; i++) {
            sentenceString.append(
                    (i != 0 && sentenceElements[i] instanceof Word ? " " : "") +
                    sentenceElements[i].toString()
            );

        }
        return sentenceString.toString();
    }
}
