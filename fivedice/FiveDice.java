package fivedice;
public class FiveDice {

    public static void main(String[] args) {

        Die[] dices = {new Die(), new Die(), new Die(), new Die(), new Die()};

        int kind3 = 0, kind4 = 0, kind5 = 0;

        for (int roll = 1; roll <= 100000; roll++) {
            rollAllDices(dices);
            if (isKindOf5(dices)) kind5 += 1;
            else if (isKindOf4(dices)) kind4 += 1;
            else if (isKindOf3(dices)) kind3 += 1;
        }

        System.out.println("In 100,000 rolls, your rolled 3 of a kind "+kind3+" times, 4 of a kind "+kind4+" times, " +
                "and 5 of a kind "+kind5+" times.");

    }

    private static boolean isKindOf3(Die[] dices) {

        int[] freq = new int[7];
        for (Die die : dices) {
            freq[die.getValue()] += 1;
        }
        for (int i = 0; i < freq.length; i++) if (freq[i] == 3) return true;
        return false;
    }

    private static boolean isKindOf4(Die[] dices) {
        int[] freq = new int[7];
        for (Die die : dices) {
            freq[die.getValue()] += 1;
        }
        for (int i = 0; i < freq.length; i++) if (freq[i] == 4) return true;
        return false;
    }

    private static void rollAllDices(Die[] dices) {

        for (Die die : dices) die.rollDie();
    }

    private static boolean isKindOf5(Die[] dices) {
        int[] freq = new int[7];
        for (Die die : dices) {
            freq[die.getValue()] += 1;
        }
        for (int i = 0; i < freq.length; i++) if (freq[i] == 5) return true;
        return false;
    }
}


