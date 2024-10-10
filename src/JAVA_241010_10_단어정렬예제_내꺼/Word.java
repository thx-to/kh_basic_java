package JAVA_241010_10_단어정렬예제_내꺼;

public class Word implements Comparable<Word> {

    private String words;

    @Override
    public int compareTo(Word o) {
        if (this.words.length() > o.words.length()) {
            return 1;
        } else {
            if (this.words.length() == o.words.length()) {
                return this.words.compareTo(o.words);
            } else {
                return -1;
            }
        }
    }

    public Word(String words) {
        this.words = words;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

}

