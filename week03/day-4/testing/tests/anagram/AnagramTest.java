package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void areTheyAnagrams() {
        Anagram anagram = new Anagram("dog", "god");
        assertTrue(anagram.compareStrings());
    }

    @Test
    public void areTheyAnagramsDifferentLength() {
        Anagram anagram = new Anagram("dog", "dogfood");
        assertFalse(anagram.compareStrings());
    }

    @Test
    public void areTheyAnagramsSameLengthButNot() {
        Anagram anagram = new Anagram("dog", "cat");
        assertFalse(anagram.compareStrings());
    }

    @Test
    public void areTheyAnagramsOneStringIsNot() {
        Anagram anagram = new Anagram("dog", "");
        assertFalse(anagram.compareStrings());
    }

    @Test
    public void areTheyAnagramsNullArgument() {
        Anagram anagram = new Anagram("god", null);
        assertFalse(anagram.compareStrings());
    }

}