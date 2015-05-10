
public class SilverCoinFactory extends CoinCreator 
{
    public SilverCoinFactory()
    {
    }

    public Coins getCoin()
    {
        return new SilverCoin();
    }
}
