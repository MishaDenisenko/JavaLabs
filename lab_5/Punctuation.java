package lab_5;

public class Punctuation extends SentenceElements{
    private String symbols;

    public Punctuation(String symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return  symbols;
    }
}
