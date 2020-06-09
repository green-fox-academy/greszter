package char_sequence;

public class Shifter implements CharSequence{

    protected String content;
    protected int numberOfShifts;

    public Shifter(String content, int numberOfShifts) {
        this.content = content;
        this.numberOfShifts = numberOfShifts;
    }


    @Override
    public int length() {
        return content.toCharArray().length;
    }

    @Override
    public char charAt(int numberOfShifts) {
        return this.content.charAt(this.numberOfShifts);
    }

    @Override
    public CharSequence subSequence(int numberOfShifts, int end) {
        StringBuilder subSequence = new StringBuilder();
        for (int i = 0; i < (end - numberOfShifts); i++) {
            subSequence.append(charAt(i));
        }
        return subSequence.toString();
    }
}
