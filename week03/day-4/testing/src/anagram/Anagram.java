package anagram;

import java.util.Arrays;

public class Anagram {

    private String word1;
    private String word2;

    public Anagram(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }


    public boolean compareStrings() {

        char[] charactersOfWord1 = this.word1==null?"".toCharArray():this.word1.toCharArray();
        char[] charactersOfWord2 = this.word2==null?"".toCharArray():this.word2.toCharArray();
        Arrays.sort(charactersOfWord1);
        Arrays.sort(charactersOfWord2);
        if (charactersOfWord1.length == charactersOfWord2.length && Arrays.equals(charactersOfWord1, charactersOfWord2)){
            return true;
        }else return false;
    }
}

