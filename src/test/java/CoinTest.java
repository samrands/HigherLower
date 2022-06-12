import org.junit.Test;

public class CoinTest {

    @Test
    public void testGetSideReturnsCorrectSide() {
        Coin coin = new Coin();
        assert coin.getSide(false) == Coin.Sides.TAILS;
        assert coin.getSide(true) == Coin.Sides.HEADS;
    }
}
