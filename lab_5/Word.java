package lab_5;

import java.util.Arrays;

public class Word extends SentenceElements{
    private Letter[] letters;

    public Word(Letter[] letters){
        this.letters = letters;
    }

    @Override
    public String toString() {
        StringBuilder wordString = new StringBuilder();
        for (Letter letter : letters) {
            wordString.append(letter.toString());
        }

        return wordString.toString();
    }
}
