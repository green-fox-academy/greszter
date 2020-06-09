package char_sequence;

public class Gnirts implements CharSequence {

    protected String content;

    public Gnirts(String content) {
        this.content = content;
    }

    @Override
    public int length() {
        return content.toCharArray().length;
    }

    @Override
    public char charAt(int index) {
        StringBuilder newContent = new StringBuilder();
        newContent.append(content);
        return newContent.reverse().charAt(index);
    }

    public void reverse(){
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < this.content.length(); i++) {
            reversed.append(this.content.charAt(i));
        }
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder subSequence = new StringBuilder();
        for (int i = 0; i > (end - start); i++) {
            subSequence.append(charAt(i));
        }
        return subSequence.toString();
    }
}
