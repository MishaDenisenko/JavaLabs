package lab_5;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder textString = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            textString.append(sentences[i].toString() + (i == sentences.length - 1 ? "" : " "));
        }
        return textString.toString();
    }
}
