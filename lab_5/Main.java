package lab_5;

public class Main {
    public static void main(String[] args) {

        Word word1 = new Word(new Letter[]{
                new Letter('М'),
                new Letter('а'),
                new Letter('м'),
                new Letter('а'),

        });

        Word word2 = new Word(new Letter[]{
                new Letter('п'),
                new Letter('о'),
                new Letter('п'),
                new Letter('р'),
                new Letter('о'),
                new Letter('с'),
                new Letter('и'),
                new Letter('л'),
                new Letter('а'),
        });

        Word word3 = new Word(new Letter[]{
                new Letter('д'),
                new Letter('о'),
                new Letter('д'),
                new Letter('е'),
                new Letter('л'),
                new Letter('а'),
                new Letter('т'),
                new Letter('ь'),
        });

        Word word4 = new Word(new Letter[]{
                new Letter('р'),
                new Letter('е'),
                new Letter('ф'),
                new Letter('е'),
                new Letter('р'),
                new Letter('а'),
                new Letter('т')
        });

        Word word5 = new Word(new Letter[]{
                new Letter('Я'),
        });

        Word word6 = new Word(new Letter[]{
                new Letter('д'),
                new Letter('о'),
                new Letter('д'),
                new Letter('е'),
                new Letter('л'),
                new Letter('а'),
                new Letter('л'),
        });

        Punctuation punctuation1 = new Punctuation("...");
        Punctuation punctuation2 = new Punctuation(".");
        Sentence sentence1 = new Sentence(new SentenceElements[]{
                word1,
                word2,
                word3,
                word4,
                punctuation1
        });

        Sentence sentence2 = new Sentence(new SentenceElements[]{
                word5,
                word6,
                punctuation2
        });

        Text text = new Text(new Sentence[]{
                sentence1,
                sentence2
        });
        System.out.println("Изначальное предложение:\n" + text);

        String[] newText = text.toString().split(" ");
        StringBuilder textA = new StringBuilder();
        for (int i = 0; i < newText.length; i++) {
            StringBuilder justWord = new StringBuilder(newText[i]);
            int r = 0;
            for (int j = 1; j < newText[i].length(); j++) {
                char c1 = newText[i].toLowerCase().charAt(0);
                char c2 = newText[i].toLowerCase().charAt(j);
                if (c1 == c2) {
                    justWord.deleteCharAt(j - r);
                    r++;
                }
            }
            String s = justWord + " ";
            textA.append(s);
        }
        System.out.println("\nРезультат после изменения:\n" + textA);
    }

}
