package fivedice;
public class Die {

    private int value;

    public int rollDie() {
        value = (int) (Math.random() * 6) + 1;
        return value;
    }

    public int getValue() {
        return value;
    }
}