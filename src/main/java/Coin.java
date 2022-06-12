import java.util.Random;

public class Coin {

    private Random randomGenerator;

    protected Coin() {
        randomGenerator = new Random();
    }

    Sides flip() {
        return getSide(randomGenerator.nextBoolean());
    }

    public Sides getSide(boolean isHeads) {
        if (isHeads) return Sides.HEADS;

        return Sides.TAILS;
    }

    public enum Sides {
        HEADS(true, "heads"),
        TAILS(false, "tails");

        private boolean side;
        private String outputString;

        private Sides(boolean side, String outputString) {
            this.side = side;
            this.outputString = outputString;
        }

        public String getOutputString() {
            return outputString;
        }
    }
}
